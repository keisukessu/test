public class Line2D {

    private Point2D p1;
    private Point2D p2;

    public Line2D(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point2D getp1() {
        return this.p1;
    }

    public Point2D getp2() {
        return this.p2;
    }

    public void setp1(Point2D p1) {
        this.p1 = p1;
    }

    public void setp2(Point2D p2) {
        this.p2 = p2;
    }

    public void print() {
        System.out.println("(" + p1.getX() + "," + p1.getY() + ")" + "-" + "(" + p2.getX() + "," + p2.getY() + ")");
    }

    public double length() {
        double bes = Math.pow((p1.getX() - p2.getX()), 2);
        double ver = Math.pow((p1.getY() - p2.getY()), 2);
        double dia = Math.pow(bes + ver, 0.5);
        return dia;
    }

    public Line2D clone() {
        return new Line2D(new Point2D(p1.getX(), p1.getY()), new Point2D(p2.getX(), p2.getY()));
    }

    public boolean equals(Line2D l) {
        if ((p1.equals(l.getp1()) && p2.equals(l.getp2())) || (p1.equals(l.getp2()) && p2.equals(l.getp1()))) {
            return true;
        } else {
            return false;
        }
    }
}
