package collections.hashcodeandequals;

import java.util.Objects;

public class Person {
    private String id;
    private int age;
    private int grade;

    public Person(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && grade == person.grade && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, grade);
    }
//    @Override
//    public int hashCode() {
//        return Integer.parseInt(id);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Person && ((Person) obj).getId() == this.id) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
