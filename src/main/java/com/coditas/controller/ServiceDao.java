package com.coditas.controller;

import com.coditas.model.Marks;
import com.coditas.model.Student;
import com.coditas.model.Subject;
import com.coditas.util.HibernateUtil;
import org.hibernate.Session;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class ServiceDao {

    HibernateUtil hibernateUtil = new HibernateUtil();
    public  int addStudents(Student student){
     Session session =hibernateUtil.getSession();
     int id = (int) session.save(student);
     session.beginTransaction().commit();
     return id;
    }

    public int addSubjects(Subject subject){
        Session session =hibernateUtil.getSession();
        int id = (int) session.save(subject);
        session.beginTransaction().commit();
        return id;
    }

    public int addMarks(Marks marks){
        Session session = hibernateUtil.getSession();
        int id= (int) session.save(marks);
        session.beginTransaction().commit();
        return id;
    }


    public List<Student> displayStudents() {
        Session session = hibernateUtil.getSession();
        List<Student> studentList = session.createQuery("from Student").list();
        return studentList;
    }
}
