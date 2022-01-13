package controlflow.conditionstatements.switchcasestatement;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        //Switch-case statement
        int number = 1;
        String res = switch (number) {
            case 0 -> "Zero";
            case 1 -> {
                String s1 = "Number";
                String s2 = "one";
                yield s1.concat(" " + s2);
            }
            case 2 -> "Two";
            default -> "Unknown";
        };

        out.println(res);

        //If statement
        if (number == 0) {
            res = "Zero";
        } else if (number == 1) {
            res = "One";
        } else if (number == 2) {
            res = "Two";
        } else {
            res = "Unknown";
        }
        out.println(res);
    }

}
