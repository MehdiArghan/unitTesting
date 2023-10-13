public class Main {
    public static void main(String[] args) {
        Deduction deductionOne = new Deduction(5, 12);
        Deduction deductionTwo = new Deduction(3, 12);
        Deduction deduction1 = deductionOne.sum(deductionTwo);
        deduction1.print();
        System.out.println("---------------------------------------");
        Deduction deduction2 = deductionOne.subTract(deductionTwo);
        deduction2.print();
        System.out.println("---------------------------------------");
        Deduction deduction3 = deductionOne.multiply(deductionTwo);
        deduction3.print();
        System.out.println("---------------------------------------");
        Deduction deduction = deductionOne.division(deductionTwo);
        System.out.println(deduction.asFraction(deduction.getNumerator(), deduction.getDenominator()));
    }
}