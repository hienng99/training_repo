package java8.lambdaexpression;

@FunctionalInterface
interface Greeting1 {
    String sayHello();
}
public class Example1 {
    public static void main(String[] args) {
        Greeting1 object = () -> "Hello";
        System.out.println(object.sayHello());
    }
}
