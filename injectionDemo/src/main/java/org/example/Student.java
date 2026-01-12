package org.example;

public class Student {
    private Course course;
    public Student(Course course) {
        this.course=course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //dependy injection
    // setter injection
    public void study(){
        int start=course.enroll();
        if(start >= 1){
            System.out.println("Student "+start+" is already enrolled");
        }
        else{
            System.out.println("Payment failed");
        }
    }
}
