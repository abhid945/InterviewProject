package com.coditas.model;

public class Marks {
    int marks;

    int subjectId;

    public Marks(int marks, int subjectId) {
        this.marks = marks;
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marks=" + marks +
                ", subjectId=" + subjectId +
                '}';
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Marks(int marks) {
        this.marks = marks;
    }

    public Marks() {
    }
}
