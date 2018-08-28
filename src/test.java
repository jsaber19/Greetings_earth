public class test {
    public static void main(String[] args){
        printHello(5);
    }
    public static String printHello(int n){
        String s = "";
        for (int i = 0; i < n; i++){
            s+="hello ";
        }
        return s;
    }
    
}
