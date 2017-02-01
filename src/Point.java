import java.util.Map;

/**
 * Determines the position of an object
 * using its x and y coordinates
 *
 * @author Jarred Black 101000247
 * @version 1/24/17
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this(point.x, point.y);
    }

    public Point(){
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    public double distance(Point point1, Point point2){
        double deltaX = point1.x - point2.x;
        double deltaY = point1.y - point2.y;
        return(Math.sqrt((deltaX * deltaX) + (deltaY * deltaY)));
    }

    public double distance(Point point){
        double deltaX = point.x - this.x;
        double deltaY = point.y - this.y;
        return(Math.sqrt((deltaX * deltaX) + (deltaY * deltaY)));
    }

    public double distance(){
        return(Math.sqrt((this.x * this.x) + (this.y * this.y)));
    }

    public String toString() {
        return "Point{" +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
