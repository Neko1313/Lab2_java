public class Ball extends SolidOfRevolution{
    public Ball(double r){
        radius = r;
        Volume = Math.PI * radius * radius * radius * 4 / 3;
    }
}
