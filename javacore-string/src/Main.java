import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\W+");
        int i = 0;
        int others = 1;
        for (String word : words) {
            if (words[i].equalsIgnoreCase("programming") && words[i - 1].equalsIgnoreCase("oriented") && words[i - 2].equalsIgnoreCase("object")) {
                if (others % 2 == 0) {
                    words[i] = "OOP";
                    words[i - 1] = "";
                    words[i - 2] = "";
                }
                others++;
            }
            i++;
        }

        System.out.println();
        System.out.println("With OOP:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Palindromes:");

        for (String word : words) {
            if (word.length() > 1) {
                String reverse = new StringBuilder(word).reverse().toString();
                if (word.equalsIgnoreCase(reverse)) {
                    System.out.println(word);
                }
            }
        }

        System.out.println();
        System.out.println("English letters only:");

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
            }
        }

        System.out.println();
        System.out.println("Minimal Difference:");

        int min = Integer.MAX_VALUE;
        for (String word : words) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.indexOf(word.charAt(j)) == word.lastIndexOf(word.charAt(j))) {
                    count++;
                }
            }
            if (count < min) {
                min = count;
            }
        }
        for (String word : words) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.indexOf(word.charAt(j)) == word.lastIndexOf(word.charAt(j))) {
                    count++;
                }
            }
            if (count == min) {
                if (word.equals("")) {
                    continue;
                }
                System.out.println(word);
                break;
            }
        }
    }
}