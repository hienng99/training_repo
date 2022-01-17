package iohandling.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private transient float gpa;

    public Student(String id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }
}
