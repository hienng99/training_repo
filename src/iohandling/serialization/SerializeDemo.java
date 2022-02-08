package iohandling.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        String path = "D:\\tma\\student.data";
        Student student = new Student("B1706583", "Nguyen Vinh Hien", 3f);
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            System.out.printf("Done!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
