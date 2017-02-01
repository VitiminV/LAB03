/**
 * Models a moving robot with its position
 * and speed.
 *
 * @author Jarred Black 101000247
 * @version 1/24/17
 */


public class Robot {
    private Point position;
    private double deltaX;
    private double deltaY;

    public Robot(Point position, double deltaX, double deltaY){
        this.position = position;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public Robot(){
    }

    public Robot(Robot robot){
        this(robot.position, robot.deltaX, robot.deltaY);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    public double getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }

    public String toString() {
        return (String.format("Robot@(%d,%d), speed = %f", this.position.getX(), this.position.getY(), (deltaX / deltaY)));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        if (Double.compare(robot.deltaX, deltaX) != 0) return false;
        if (Double.compare(robot.deltaY, deltaY) != 0) return false;
        return position.equals(robot.position);
    }

    public Robot move(){
        return this;
    }

    public Robot move(int deltaX, int deltaY){
        int x = this.position.getX();
        int y = this.position.getY();
        this.position.setX(x + deltaX);
        this.position.setY(y + deltaY);
        return this;
    }
}