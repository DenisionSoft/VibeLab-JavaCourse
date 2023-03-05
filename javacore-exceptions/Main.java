import java.util.Scanner;

class LongException extends Exception {
    LongException (String w) { super (w); }
};

public class Main {
    public static void main(String[] args) throws LongException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\W+");

        for (String word : words) {
            try {
                if (word.length() > 10) {
                    throw new LongException("Слово " + word + " слишком длинное");
                    }
            } catch (LongException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
