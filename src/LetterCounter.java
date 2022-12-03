import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputSentence = scanner.nextLine();
        int sentenceLength = inputSentence.length();
        int counter = 0;
        char firstChar = inputSentence.charAt(0);

        while (counter < sentenceLength) {
            System.out.println(firstChar);
            counter++;
        }
    }
}
