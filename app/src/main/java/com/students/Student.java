package com.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name, String groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName(){
        return name;
    }

    public String getGroupNumber(){
        return groupNumber;
    }

    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Карпенко Сергій","301"),
                    new Student("Шаповалов Єгор","301"),
                    new Student("Шевченко Данил","302"),
                    new Student("Таран Максим","302"),
                    new Student("Сурков Ігор","302"),
                    new Student("Кононіхін Максим","303"),
                    new Student("Савкін Микита","304"),
                    new Student("Шевченко Олександр","304")
            )
    );

    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students){
            if(s.getGroupNumber().equals(groupNumber)){
                stList.add(s);
            }
        }
        return stList;
    }

    @Override
    public String toString() {
        return  name;
    }
}
