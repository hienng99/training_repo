package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentConcreteBuilder()
                .setFirstName("Nguyen")
                .setLastName("Vinh-Hien");
        studentBuilder.getInfo();
    }
}
