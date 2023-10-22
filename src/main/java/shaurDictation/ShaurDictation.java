package shaurDictation;

import java.io.IOException;
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
    private static final String QUIT_STRING = "quit";
    private static final Scanner scanner = new Scanner(System.in, "Cp866");
    private static final WordWriter wordWriter = new WordWriter();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Welcome to" + PROJECT_NAME + ' ' + VERSION + ".");
            System.out.println("Type \"start\" to start dictation or \"words\" to see words or \"quit\" to quit...");

            String input = scanner.nextLine();

            if (input.equals(START_STRING)) {
                System.out.println("Dictation isn't developed yet.");
                System.out.println();
            } else if (input.equals(WORD_STRING)) {
                while (true) {
                    System.out.println("Welcome to words redacting mode.");
                    System.out.println("Type correct word or \"quit\" to quit:");
                    input = scanner.nextLine();

                    if (input.equals(QUIT_STRING)) {
                        break;
                    } else {
                        String correct = input;
                        System.out.println("Type transcription:");
                        String transcription = scanner.nextLine();

                        Word word = new Word(correct, transcription);
                        wordWriter.writeWord(word);
                        System.out.println("Word successfully written.");
                    }
                }
            } else if (input.equals(QUIT_STRING)) {
                break;
            }
        }
    }
}
