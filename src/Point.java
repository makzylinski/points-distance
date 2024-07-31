public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public double distance() {
        return Math.sqrt( (0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public double distance(Point p) {
        return Math.sqrt( (p.getX() - getX()) * (p.getX() - getX()) + (p.getY() - getY()) * (p.getY() - getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt( (getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }
}


