package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BallCountCheckerTest {

    private String answer;

    @BeforeEach
    public void setUp(){
        this.answer = "713";
    }

    @ParameterizedTest(name = "{index} => input={0}, {1}S {2}B")
    @CsvSource(value = {"123:1:1", "145:0:1", "671:0:2", "216:1:0", "713:3:0"}, delimiter = ':')
    public void checkNumber(final String input, final int expectedStrike, final int expectedBall){
        BallCount result = BallCountChecker.check(input, this.answer);

        assertThat(result).isEqualToComparingFieldByField(new BallCount(expectedStrike, expectedBall));
    }
}
