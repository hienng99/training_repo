package iohandling.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import static java.lang.System.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        Student student = null;
        String path = "D:\\tma\\student.data";
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            student = (Student) ois.readObject();
            out.println("Student information: ");
            out.println("ID: " + student.getId());
            out.println("Name: " + student.getName());
            out.println("GPA: " + student.getGpa());
        } catch (Exception e) {
            out.println(e);
        }
    }
}//json and xml
//jackson and gson
