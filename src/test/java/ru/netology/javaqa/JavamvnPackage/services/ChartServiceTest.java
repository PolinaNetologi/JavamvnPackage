package ru.netology.javaqa.JavamvnPackage.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChartServiceTest {
    @Test
    public void testWhenFreelancerRest3Months() {
        ChartService service = new ChartService();

        int actual = service.calculate ( 10_000, 3_000,20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testWhenFreelancerRest2Months() {
        ChartService service = new ChartService();

        int actual = service.calculate ( 100_000, 60_000,150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}
