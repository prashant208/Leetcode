import java.util.Scanner;

public class main {
    public static String toLowerCase(String s) {
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; ++i) {
            if (characters[i] >= 'A' && characters[i] <= 'Z') {
                characters[i] |= 32;
            }
        }
        return String.valueOf(characters);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(toLowerCase(s));
    }
}