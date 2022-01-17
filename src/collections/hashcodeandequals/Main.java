package collections.hashcodeandequals;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("123");
        Person person2 = new Person("123");
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println((person.equals(person2)));
    }
}
