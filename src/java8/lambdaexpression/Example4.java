package java8.lambdaexpression;

@FunctionalInterface
interface StringFunction {
    String run(String str);
}

public class Example4 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> {
            String a = "Java";
            s += a;
            return s;
        };
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
