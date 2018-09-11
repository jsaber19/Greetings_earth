public class fair_and_square implements Shape_version_test {
    private double side;

    public fair_and_square(double side){
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }
}
