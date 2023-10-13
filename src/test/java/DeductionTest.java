import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeductionTest {
    private Deduction deduction1;
    private Deduction deduction2;

    @BeforeEach
    void setUp() {
        deduction1 = new Deduction(1, 2);
        deduction2 = new Deduction(3, 5);
    }

    @Test
    void sum() {
        Deduction sum = deduction1.sum(deduction2);
        String a = String.valueOf(sum.getNumerator());
        String b = String.valueOf(sum.getDenominator());
        assertEquals("11/10", (a + "/" + b));
    }

    @Test
    void subTract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void division() {
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