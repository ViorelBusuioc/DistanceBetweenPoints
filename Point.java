public class Point {

    private int x;
    private int y;

    public double distance() {

        return distance(0,0);
    }

    public double distance (int x, int y) {

        return Math.sqrt(Math.pow(x - getX(),2) + Math.pow(y - getY(),2));
    }

    public double distance (Point anotherPoint) {

        return distance(anotherPoint.x, anotherPoint.y);
    }

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point (int x, int y) {
        setX(x);
        setY(y);
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
}
