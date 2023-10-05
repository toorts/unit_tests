package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService service;

    @BeforeEach
    void setUp() {
        service = new SomeService();
    }

    // 3.1
    @Test
    void multipleThreeNotFiveReturnsFizz() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(12), "Fizz");
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(10), "Buzz");
    }

    @Test
    void multipleFiveAndThreeReturnsFizzBuzz() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    void multipleNotFiveNotThreeReturnsNumber() {
        SomeService service = new SomeService();
        assertEquals(service.fizzBuzz(11), "11");
    }


    // 3.2
    @Test
    void first6Test() {
        SomeService someService = new SomeService();
        int[] arr = {6, 4, 5, 7};
        assertTrue(someService.firstLast6(arr));
    }

    @Test
    void last6Test() {
        SomeService someService = new SomeService();
        int[] arr = {7, 4, 5, 6};
        assertTrue(someService.firstLast6(arr));
    }

    @Test
    void firstLast6Test() {
        SomeService someService = new SomeService();
        int[] arr = {6, 4, 5, 6};
        assertTrue(someService.firstLast6(arr));
    }

    @Test
    void firstLastNot6Test() {
        SomeService someService = new SomeService();
        int[] arr = {7, 4, 5, 8};
        assertFalse(someService.firstLast6(arr));
    }


    // 3.3
    /**
     * @param discount
     * @apiNote Процент скидки больше 100% или меньше 0
     */
    @ParameterizedTest
    @ValueSource(ints = {-10, 110})
    void insufficientDiscountAmountTest(int discount) {
        assertThatThrownBy(() ->
                service.calculatingDiscount(2000.0, discount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    /**
     * @param discount
     * @param result
     * @ApiNote Обычная скидка
     */
    @ParameterizedTest
    @CsvSource({"50, 1000", "100, 0", "0, 2000"})
    void correctDiscountCalculatingTest(int discount, int result) {
        assertThat(service.calculatingDiscount(2000.0, discount))
                .isEqualTo(result);
    }


    // 3.4
    @Test
    void luckySumATest() {
        assertEquals(service.luckySum(13, 2, 3), 5);
    }

    @Test
    void luckySumBTest() {
        assertEquals(service.luckySum(3, 13, 3), 6);
    }

    @Test
    void luckySumCTest() {
        assertEquals(service.luckySum(3, 6, 13), 9);
    }

    @Test
    void luckySumTest() {
        assertEquals(service.luckySum(3, 6, 8), 17);
    }

    @Test
    void luckySumDoubleTest() {
        assertEquals(service.luckySum(13, 13, 8), 21);
    }

}