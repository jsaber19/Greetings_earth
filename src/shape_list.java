import java.util.ArrayList;
public class shape_list {
    public static void main(String[] args){
        ArrayList<Shape_version_test> shapelist = new ArrayList<Shape_version_test>();
        shapelist.add(new triangle_my_angle(3, 5));
        shapelist.add(new Circle_test(5));
        shapelist.add(new fair_and_square(7));

        for (Shape_version_test s : shapelist){
            System.out.println(s.getArea() + " units squared.");
        }
    }
}
