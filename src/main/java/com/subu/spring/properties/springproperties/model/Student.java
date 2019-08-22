package com.subu.spring.properties.springproperties.model;

/**
 * Created by 195920 on 8/21/2019.
 */
public class Student {
    int id;
    String name;

    public Student(int studentId, String studentName) {
        this.id = studentId;
        this.name = studentName;
    }
    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
