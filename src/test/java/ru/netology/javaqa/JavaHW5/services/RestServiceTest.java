package ru.netology.javaqa.JavaHW5.services;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/relax.csv")
    public void testRestChipCalculate(int extended, int income, int expenses, int threshold) {
        RestService service = new RestService();

        int actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(extended, actual);
    }

    /*@Test
    public void testRestRichCalculate() {
        RestService service = new RestService();

        int extended = 2;
        int actual = service.calcRest(100_000, 60_000, 150_000);

        Assertions.assertEquals(extended, actual);
    }*/
}
