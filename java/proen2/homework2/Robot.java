public class Robot {
    private Position position;
    private String name;

    public Robot(Position position, String name) {
        this.position = position;
        this.name = name;
    }

    public void moveX(int xDelta) {
        position.moveX(xDelta);
    }

    public void moveY(int yDelta) {
        position.moveY(yDelta);
    }

    public void moveXY(int xDelta, int yDelta) {
        position.moveXY(xDelta, yDelta);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public String toString() {
        return "name:" + name + "position:" + position;
    }

    public Robot makeClone1() {
        return new Robot(this.position, this.name + "クローン");
    }

    public Robot makeClone2() {
        return new Robot(new Position(position.getX(), position.getY()), name + "クローン");
    }

}
