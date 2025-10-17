import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String sentence = sc.nextLine();
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        String replace = sentence.replace("dang", "***").replace("nuts", "***").replace("oops", "***").replace("yikes", "***");
        // TODO: Print the result prefixed with: Censored:
        System.out.println("Censored:" + replace);
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
