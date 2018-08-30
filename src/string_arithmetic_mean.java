
public class string_arithmetic_mean {
    public static void main(String[] args){
        System.out.println(findMean("41 18 -20 4 0 18"));
    }
    public static double findMean(String s){
        double denom = 0;
        int numerator = 0;
        String[] nums = s.split(" ");
        for (String i : nums){
            numerator+=Integer.parseInt(i);
        }
//        for (int i = 0; i<s.length(); i++){
//            if (s.charAt(i)==' ') denom++;
//        }
//        denom++;
        denom = nums.length;
        return numerator/denom;
    }
}
