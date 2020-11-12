package baseball;

import java.util.Scanner;

public class Main {

    public static void main(String... args){
        System.out.println("Play Ball!!");
        String endInput;
        do {
            String answer = "713";

            InputScanner scanner = new InputConsoleTypeScanner();
            String ballCount;
            do{
                String input = scanner.inputBallNumber3Length();
                ballCount = BallCountChecker.check(input, answer);
                System.out.println(ballCount);
            } while(!ballCount.equals("3S0B0O"));

            endInput = scanner.inputEndGame();
        } while (endInput.equals("1"));
    }
}
