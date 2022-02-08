package java8.lambdaexpression;

@FunctionalInterface
interface Greeting2 {
    String sayHello(String name);
}

public class Example2 {
    public static void main(String[] args) {
        Greeting2 object = name -> "Hello " + name;
        System.out.println(object.sayHello("Java8"));
    }
}
