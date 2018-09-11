public class Circle_test implements Shape_version_test {
    private double radius;

    public Circle_test(double r){
        radius = r;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
