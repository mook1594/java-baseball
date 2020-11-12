package baseball;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidUtilsTest {

    @ParameterizedTest
    @CsvSource(value = {"123:true", "012:true", "abc:false", ":false"}, delimiter = ':')
    public void isNumber(final String input, final boolean expected){
        assertThat(ValidUtils.isNumeric(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "12:false", ":false"}, delimiter = ':')
    public void is1or2(final String input, final boolean expected){
        assertThat(ValidUtils.is1Or2(input)).isEqualTo(expected);
    }
}
