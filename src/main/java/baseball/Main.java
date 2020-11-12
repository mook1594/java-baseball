package baseball;

import java.util.Scanner;

public class Main {

    public static void main(String... args){
        System.out.println("Play Ball!!");

        InputScanner scanner = new InputConsoleTypeScanner();
        String ballCount;
        do{
            String input = scanner.inputBallNumber3Length();
            ballCount = BallCountChecker.check(input, "713");
            System.out.println(ballCount);
        } while(!ballCount.equals("3S0B0O"));
    }
}
