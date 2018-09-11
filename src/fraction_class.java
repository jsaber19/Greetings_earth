public class fraction_class implements Comparable<fraction_class>{
    private int numerator;
    private int denominator;

    public fraction_class(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getFractionAsDecimal(){
        return (double)numerator/denominator;
    }

    public String getFractionAsString(){
        return numerator + "/" + denominator;
    }

    public int compareTo(fraction_class other){
        if (this.getFractionAsDecimal() - other.getFractionAsDecimal() < 0) return -1;
        else if (this.getFractionAsDecimal() - other.getFractionAsDecimal() == 0) return 0;
        else return 1;
    }
}
