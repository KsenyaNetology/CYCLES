package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    void shouldCalcForRestAndWork1() {
        VacationService service = new VacationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = (int) service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcForRestAndWork2() {
        VacationService service = new VacationService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = (int) service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
