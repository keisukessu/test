public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D clone() {
        return new Point2D(x, y);
    }
}
