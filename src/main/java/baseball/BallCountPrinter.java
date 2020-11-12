package baseball;

public class BallCountPrinter {
    private final static String EMPTY_STRING = "";

    public static String makeText(String code){
        StringBuilder sb = new StringBuilder();
        sb.append(numberText(code.charAt(0), "스트라이크"));
        sb.append(numberText(code.charAt(2), "볼"));

        String result = sb.toString().trim();
        return result.equals(EMPTY_STRING) ? "낫싱" : result;
    }

    private static String numberText(final char number, final String ballType){
        return number == '0' ? EMPTY_STRING : number + ballType + " ";
    }
}
