package baseball;

import java.util.Scanner;

public class InputConsoleTypeScanner implements InputScanner {

    final String INPUT_BALL_NUMBER_LABEL = "숫자를 입력해주세요 : ";
    final String INPUT_GAME_END_LABEL = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    final Scanner sc;

    public InputConsoleTypeScanner() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public String inputBallNumber3Length() {
        System.out.print(INPUT_BALL_NUMBER_LABEL);
        String input = sc.next();
        do{
            System.out.print(INPUT_BALL_NUMBER_LABEL);
            input = sc.next();
        } while(!ValidUtils.isNumeric(input) || !ValidUtils.isLength3(input));

        return input;
    }

    @Override
    public String inputEndGame() {
        System.out.println(INPUT_GAME_END_LABEL);
        String input = sc.next();

        return input;
    }
}
