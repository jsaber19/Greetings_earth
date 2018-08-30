import java.util.ArrayList;
import java.util.Scanner;

public class practice_test_1 {
    public static void main(String[] args){
        ArrayList<Double> nums = new ArrayList();
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number.");
            double temp = console.nextDouble();
            if (!nums.contains(temp)) {
                nums.add(temp);
            } else {
                System.out.println("The numbers you entered were " + nums);
                System.out.println("The arithmetic mean is " + arith(nums));
                System.out.println("The geometric mean is " + geom(nums));
                break;
            }
        }
    }
    public static double arith(ArrayList<Double> d){
        double sum = 0;
        for (double num : d){
            sum+=num;
        }
        return sum/(double)d.size();
    }
    public static double geom(ArrayList<Double> d){
        double product = 1;
        for (double num : d){
            product*=num;
        }
        return Math.pow(product, 1/(double)d.size());
    }
}
