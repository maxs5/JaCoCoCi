package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMaxLongInterval() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxShortInterval() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 1, 2, 3, 4, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxZeroSpacing() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 0, 0, 0, 0, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSameNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {4, 4, 4, 4, 4, 4};
        long expected = 4;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}