package MovablePoint;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.3f,3.5f,10,20);
        System.out.println(movablePoint);
        movablePoint.setXYSpeed(2.35f,10.5f);
        System.out.println(movablePoint);
    }
}
