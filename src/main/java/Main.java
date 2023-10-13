public class Main {
    public static void main(String[] args) {
        Deduction deductionOne = new Deduction(1, 2);
        Deduction deductionTwo = new Deduction(3, 5);
        Deduction deduction = deductionOne.division(deductionTwo);
        deduction.print();
        System.out.println("---------------------------------------");
        Deduction deduction1 = deductionOne.sum(deductionTwo);
        deduction1.print();
        System.out.println("---------------------------------------");
        System.out.println(deduction.asFraction(deduction.getNumerator(), deduction.getDenominator()));
    }
}