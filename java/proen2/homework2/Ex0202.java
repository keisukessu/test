
public class Ex0202 {
    public static void main(String[] args) {
        Point2D p1, p2;
        p1 = new Point2D(10.0, 20.0);
        p2 = new Point2D(20.0, 30.0);
        p1.print();
        p2.print();
        p2 = p1; // p2 に p1 を代入
        p2.setX(100.0); // p2 の X 座標を変更
        // p1,p2 を表示すると
        p1.print();
        p2.print();
    }
}
