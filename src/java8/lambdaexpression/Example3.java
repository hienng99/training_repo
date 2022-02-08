package java8.lambdaexpression;

@FunctionalInterface
interface Greeting3 {
    String sayHello(String name, String message);
}

public class Example3 {
    public static void main(String[] args) {
        Greeting3 object = (name, message) -> "Hello " + name + ". " + message;
        System.out.println(object.sayHello("Crypto", "Nice to meet you"));
    }
}
