public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(130);
        Cylinder cylinder1 = new Cylinder(2,4);
        Ball ball1 = new Ball(5);
        Pyramid pyramid1 = new Pyramid(15,3);
        System.out.println(box1.add(cylinder1));
        System.out.println(box1.add(ball1));
        System.out.println(box1.add(pyramid1));
    }
}