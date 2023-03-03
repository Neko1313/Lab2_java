public class Cylinder extends SolidOfRevolution{

    public double height;
    public Cylinder(double r, double h){
        radius = r;
        height = h;
        Volume = Math.PI * radius * radius * height;
    }

}
