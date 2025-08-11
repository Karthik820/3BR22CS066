import java.util.*;

public class jumbledwords {

    // Method to jumble a single word
    public static String jumble(int method, String word) {
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        if (method == 1) {
            for (int i = 0; i < word.length(); i += 2)
                part1.append(word.charAt(i));

            for (int i = word.length() - 1; i >= 0; i--)
                if ((i + 1) % 2 == 0)
                    part2.append(word.charAt(i));
        }
        else if (method == 2) {
            for (int i = 0; i < word.length(); i += 2)
                part1.append(word.charAt(i));

            for (int i = 1; i < word.length(); i += 2)
                part2.append(word.charAt(i));
        }

        return part1.append(part2).toString();
    }

    // Method to jumble an entire sentence
    public static String jumbledSentence(String sentence, int method) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words)
            result.append(jumble(method, w)).append(" ");

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Choose method (1 or 2): ");
        int method = sc.nextInt();

        System.out.println(jumbledSentence(sentence, method));
        sc.close();
    }
}

