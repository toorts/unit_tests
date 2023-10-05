package seminars.third.hw;

public class Numbers {
    /**
     * HW 3.1. Нужно покрыть тестами метод на 100%
     * Метод проверяет, является ли целое число записанное в переменную n,
     * чётным (true) либо нечётным (false).
     */
    public boolean evenOrOdd(int n) {
        return n % 2 == 0;
    }


    /**
     * HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
     * и возвращает true, если попадает и false - если нет,
     * покрыть тестами метод на 100%
     */
    public boolean intervalNumbers(int n) {
        return n > 24 && n < 101;
    }
}
