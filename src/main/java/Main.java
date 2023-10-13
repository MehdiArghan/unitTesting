public class Main {
    public static void main(String[] args) {
        Deduction deductionOne = new Deduction(1, 2);
        Deduction deductionTwo = new Deduction(3, 4);
        Deduction deduction = deductionOne.division(deductionTwo);
        deduction.print();
        System.out.println(deduction.asFraction(deduction.getNumerator(), deduction.getDenominator()));
    }
}