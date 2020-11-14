package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidatorTest {

	@ParameterizedTest
	@CsvSource(value = {"123:true", "012:true", "abc:false", ":false"}, delimiter = ':')
	public void isNumber(final String input, final boolean expected) {
		assertThat(Validator.isNumber(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource(value = {"123:true", "abc:true", ":false", "1:false"}, delimiter = ':')
	public void isLength3(final String input, final boolean expected) {
		assertThat(Validator.isLength3(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource(value = {"1:true", "2:true", "3:false", ":false", "sav:false"}, delimiter = ':')
	public void isNumber1Or2(final String input, final boolean expected) {
		assertThat(Validator.isNumber1Or2(input)).isEqualTo(expected);
	}
}
