package org.example;

public class App {
    public static void main(String[] args) {

        //1. Dependancy injection by method
//        Student s=new Student();
//        Course course=new DSA();
//        s.setCourse(course);
        //2.  Dependency injection by costructur
        Course course=new DSA();
        Student s=new Student(course);

        s.study();
    }
}
