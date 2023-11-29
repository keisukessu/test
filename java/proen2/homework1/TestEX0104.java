public class TestEX0104 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(0.0, 0.0);
        Point2D p2 = new Point2D(0.0, 0.0);
        Line2D line = new Line2D(p1, p2);
        p1.setX(10.0);
        p1.setY(20.0);
        p2.setX(20.0);
        p2.setY(30.0);

        line.print();
    }
}
