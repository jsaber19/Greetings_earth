public class geometric_mean_test_v1 {
    public static void main(String[] args){
        int[] test_final = {18, 2};
        System.out.println(mean(test_final));
    }
    public static double mean(int[] nums){
        int product = 1;
        for (double i : nums){
            product*=i;
        }
        return Math.pow(product, 1/(double)nums.length);
    }
}
