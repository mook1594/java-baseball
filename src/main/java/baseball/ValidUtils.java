package baseball;

import java.util.Objects;

public class ValidUtils {
    public static boolean isNumeric(String string) {
        try{
            Integer.parseInt(string);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public static boolean is1Or2(String string) {
        if (Objects.nonNull(string) && (string.equals("1") || string.equals("2"))){
            return true;
        }
        return false;
    }
}
