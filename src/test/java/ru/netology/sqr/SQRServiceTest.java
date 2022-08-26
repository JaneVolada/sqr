package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void testSqr(int expected, int borderA, int borderB) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(borderA, borderB);

        Assertions.assertEquals(expected, actual);

    }


}
