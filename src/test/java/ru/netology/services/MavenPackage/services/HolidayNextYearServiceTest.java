package ru.netology.services.MavenPackage.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayNextYearServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sources.csv")
    void WorkingSchedule(int income, int expenses, int threshold, int expected) {
        HolidayNextYearService service = new HolidayNextYearService();
        //       int income = 100_000;
        //       int expenses = 60_000;
        //       int threshold = 150_000;
        //      int expected = 2;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}