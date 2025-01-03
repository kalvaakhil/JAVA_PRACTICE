import java.util.*;

public class PangramWithSet {
    public static boolean isPangram(String str) {
        Set<Character> letters = new HashSet<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        return letters.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(input) ? "Pangram" : "Not a Pangram");
    }
}
