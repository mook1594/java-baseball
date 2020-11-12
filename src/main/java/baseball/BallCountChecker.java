package baseball;

public class BallCountChecker {
    private static final int BALL_COUNT_SIZE = 3;

    public static String check(String input, String answer) {
        int strike = 0;
        int ball = 0;
        int out = 0;

        for(int i = 0; i < BALL_COUNT_SIZE; i++){
            if(isStrike(input.charAt(i), answer.charAt(i))){
                strike++;
            } else if(isBall(input.charAt(i), answer)){
                ball++;
            } else {
                out++;
            }
        }

        return new StringBuilder()
                .append(strike)
                .append("S")
                .append(ball)
                .append("B")
                .append(out)
                .append("O")
                .toString();
    }

    private static boolean isStrike(final char input, final char answer){
        if(input == answer){
            return true;
        }
        return false;
    }

    private static boolean isBall(final char input, final String answer){
        if(answer.contains(Character.toString(input))){
            return true;
        }
        return false;
    }
}
