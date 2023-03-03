public class Pyramid extends Shape{
    public  double square;
    public double height;
    public Pyramid(double s, double h){
        height = h;
        square = s;
        Volume = square * height / 3;
    }
}
