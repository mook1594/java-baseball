package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    public void test12(){
        final String input = "1,2";

        String[] split = input.split(",");
        assertThat(split).containsExactly("1", "2");
    }

    @Test
    public void test1(){
        final String input = "1";

        String[] split = input.split(",");
        assertThat(split).containsExactly("1");
    }
}
