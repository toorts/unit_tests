package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNumbers {

    /**
     * HW 3.1. Нужно покрыть тестами метод на 100%
     * Метод проверяет, является ли целое число записанное в переменную n,
     * чётным (true) либо нечётным (false).
     */
    @Test
    void evenOrOddTrueTest() {
        Numbers numbers = new Numbers();
        assertTrue(numbers.evenOrOdd(4));
    }

    @Test
    void evenOrOddFalseTest() {
        Numbers numbers = new Numbers();
        assertFalse(numbers.evenOrOdd(5));
    }


    /**
     * HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
     * и возвращает true, если попадает и false - если нет,
     * покрыть тестами метод на 100%
     */
    @Test
    void intervalNumberLessThan25Test() {
        Numbers numbers = new Numbers();
        assertFalse(numbers.intervalNumbers(24));
    }

    @Test
    void intervalNumberMoreThan100Test() {
        Numbers numbers = new Numbers();
        assertFalse(numbers.intervalNumbers(101));
    }


    @Test
    void intervalNumber100Test() {
        Numbers numbers = new Numbers();
        assertTrue(numbers.intervalNumbers(100));
    }
    @Test
    void intervalNumber25Test() {
        Numbers numbers = new Numbers();
        assertTrue(numbers.intervalNumbers(25));
    }


}
