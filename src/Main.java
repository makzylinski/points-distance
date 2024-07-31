public class Main {
    public static void main(String[] args) {
        Point point = new Point(6, 5);
        System.out.println("Distance from point (0, 0) = " + point.distance());
        System.out.println("Distance from given parameter type Point " + point.distance(new Point(3, 1)));
        System.out.println("Distance from exact point " + point.distance(2, 2));
    }
}
