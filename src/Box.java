public class Box extends Shape{
    public Box(double v){
        Volume = v;
    }

    public boolean add(Shape volume_shape){
        if (Volume - volume_shape.getVolume() > 0 ){
            Volume = Volume - volume_shape.getVolume();
            return true;
        }
        else {
            return false;
        }
    }
}
