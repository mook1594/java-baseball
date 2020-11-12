package baseball;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BallCountPrinterTest {

    @ParameterizedTest
    @CsvSource(delimiter = ':',
    value = {
            "1S1B0O:1스트라이크 1볼",
            "0S1B2O:1볼",
            "0S2B1O:2볼",
            "1S0B2O:1스트라이크",
            "3S0B0O:3스트라이크",
            "0S0B3O:낫싱",
    })
    public void test(String code, String expected){
        String result = BallCountPrinter.makeText(code);
        assertThat(result).isEqualTo(expected);
    }
}
