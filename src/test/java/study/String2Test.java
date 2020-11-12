package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class String2Test {

    @Test
    public void test(){
        String input = "(1,2)";
        String result = input.replace("(", "").replace(")", "");

        assertThat(result).isEqualTo("1,2");
    }
}
