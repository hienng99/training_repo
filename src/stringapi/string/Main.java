package stringapi.string;

import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(Objects.equals(s1, s2));
        String s3 = "The cat catch the rat";
        System.out.println("Substring: " + s3.substring(2, 6));
        System.out.println("S3 after substring: " + s3);
        System.out.println("Char at 4: " + s3.charAt(4));
        System.out.println("Length: " + s3.length());
        System.out.println("Equals: " + s3.equals(s1));
        System.out.println("Concat: " + s3.concat(" in the dark."));
        System.out.println("Replace: " + s3.replace("rat", "mouse"));
        String s4 = "     ".concat(s3).concat("          ");
        System.out.println("LowerCase: " + s3.toLowerCase());
        System.out.println("UpperCase: " + s3.toUpperCase());
        System.out.println("Trim: " + s4.trim());
        String[] arr = s3.split("\\s", 0);
        for (String word : arr) {
            System.out.println(word);
        }
        for(char letter : s3.toCharArray()) {
            System.out.println(letter);
        }
    }
}
