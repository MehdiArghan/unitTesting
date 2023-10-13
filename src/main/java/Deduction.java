public class Deduction {
    private int numerator;
    private int denominator;

    public Deduction() {
    }

    public Deduction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Deduction sum(Deduction ration) {
        int numerator = (this.numerator * ration.getDenominator()) + (ration.getNumerator() * this.denominator);
        int denominator = this.denominator * ration.getDenominator();
        return new Deduction(numerator, denominator);
    }


    public Deduction subTract(Deduction ration) {
        int numerator = (this.numerator * ration.getDenominator()) - (ration.getNumerator() * this.denominator);
        int denominator = this.denominator * ration.getDenominator();
        return new Deduction(numerator, denominator);
    }


    public Deduction multiply(Deduction ration) {
        int numerator = this.numerator * ration.getNumerator();
        int denominator = this.denominator * ration.getDenominator();
        return new Deduction(numerator, denominator);
    }


    public Deduction division(Deduction ration) {
        int numerator = this.numerator * ration.getDenominator();
        int denominator = this.denominator * ration.getNumerator();
        return new Deduction(numerator, denominator);
    }


    private int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        } else {
            return gcd(denominator, numerator % denominator);
        }
    }


    public String asFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        return (numerator / gcd) + "/" + (denominator / gcd);
    }


    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}