package com.coditas.model;

import com.coditas.model.Marks;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int subjectId;
    private String subjectName;

    @OneToOne
    private Marks marks;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName=" + subjectName +
                '}';
    }

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject() {
    }
}
