package ru.netology.javaqa.JavaHW5.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestServiceTest {

    @Test
    public void testRestChipCalculate() {
        RestService service = new RestService();

        int extended = 3;
        int actual = service.calcRest(10_000, 3_000, 20_000);

        Assertions.assertEquals(extended, actual);
    }

    @Test
    public void testRestRichCalculate() {
        RestService service = new RestService();

        int extended = 2;
        int actual = service.calcRest(100_000, 60_000, 150_000);

        Assertions.assertEquals(extended, actual);
    }
}
