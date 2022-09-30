package com.coditas.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;

    private int phoneNumber;

    @OneToMany
    private List<Subject> subjects;

    public Student(int studentId, String studentName,int phoneNumber, List<Subject> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.subjects = subjects;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


    public Student(String studentName, int phoneNumber, List<Subject> subjects) {
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.subjects = subjects;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
