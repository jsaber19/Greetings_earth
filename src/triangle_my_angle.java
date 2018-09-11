public class triangle_my_angle implements Shape_version_test{
    private double length, height;

    public triangle_my_angle(double l, double h){
        length = l;
        height = h;
    }

    public double getArea(){
        return .5*length*height;
    }
}
