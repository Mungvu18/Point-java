package Point;

public class MainPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.5f,3.4f);
        System.out.println(point);
        point.setX(10);
        point.setXY(20,23.3f);
        System.out.println(point);
    }
}
