package shaurDictation;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ShaurDictation {
    private static final String VERSION = "0-SNAPSHOT";
    private static final String PROJECT_NAME = "Shaur-Dictation";
    private static final String START_STRING = "start";
    private static final String WORD_STRING = "words";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to" + PROJECT_NAME + ' ' + VERSION + ".");
            System.out.println("Type \"start\" to start dictation or \"words\" to see words.");

            String input = scanner.nextLine();

            if (input.equals(START_STRING)) {
                System.out.println("Dictation isn't developed yet.");
            } else if (input.equals(WORD_STRING)) {
                System.out.println("Words isn't developed yet.");
            }
        }
    }
}
