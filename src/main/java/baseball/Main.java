package baseball;

import java.util.Scanner;

public class Main {

    public static void main(String... args){
        System.out.println("Play Ball!!");

        InputScanner scanner = new InputConsoleTypeScanner();
        String input = scanner.inputBallNumber3Length();

        String ballCount = BallCountChecker.check(input, "713");

        System.out.println(ballCount);
    }
}
