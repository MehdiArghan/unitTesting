import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeductionTest {
    private Deduction deduction1;
    private Deduction deduction2;

    @BeforeEach
    void setUp() {
        deduction1 = new Deduction(5, 12);
        deduction2 = new Deduction(3, 12);
    }

    @Test
    void sum() {
        Deduction sum = deduction1.sum(deduction2);
        String a = String.valueOf(sum.getNumerator());
        String b = String.valueOf(sum.getDenominator());
        assertEquals("96/144", (a + "/" + b));
    }

    @Test
    void subTract() {
        Deduction subTract = deduction1.subTract(deduction2);
        String a = String.valueOf(subTract.getNumerator());
        String b = String.valueOf(subTract.getDenominator());
        assertEquals("24/144", (a + "/" + b));
    }

    @Test
    void multiply() {
        Deduction multiply = deduction1.multiply(deduction2);
        String a = String.valueOf(multiply.getNumerator());
        String b = String.valueOf(multiply.getDenominator());
        assertEquals("15/144", (a + "/" + b));
    }

    @Test
    void division() {
        Deduction division = deduction1.division(deduction2);
        String a = String.valueOf(division.getNumerator());
        String b = String.valueOf(division.getDenominator());
        assertEquals("60/36", (a + "/" + b));
    }

    @Test
    void asFraction() {
        String actual = deduction1.asFraction(5, 10);
        assertEquals("1/2", actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("The Test Passed!!!");
    }
}