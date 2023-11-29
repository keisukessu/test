public class TestEx0207 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(10, 10);
        Point2D p2 = p1.clone(); // p2をクローン
        p2.setX(20); // p2のx座標を変更
        p1.print();
        p2.print();
    }
}
