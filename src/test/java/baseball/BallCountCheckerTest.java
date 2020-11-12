package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallCountCheckerTest {

    private String answer;

    @BeforeEach
    public void setUp(){
        this.answer = "713";
    }

    @ParameterizedTest
    @CsvSource(value = {"123:1S1B1O", "145:0S1B2O", "671:0S2B1O", "216:1S0B2O", "713:3S0B0O"}, delimiter = ':')
    public void checkNumber(final String number, final String expected){
        String result = BallCountChecker.check(number, this.answer);

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "", "a", "abc", "ㄱㄴㄷ"})
    public void inputLengthValid(String input){
        assertThatThrownBy(() -> {
            String result = BallCountChecker.check(input, this.answer);
        }).isInstanceOf(InvalidParameterException.class);
    }
}
