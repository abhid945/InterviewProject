package com.coditas.controller;

import com.coditas.dao.StudentDao;
import com.coditas.model.Marks;
import com.coditas.model.Student;
import com.coditas.model.Subject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestHandler extends HttpServlet {

    ServiceDao serviceDao = new ServiceDao();
    StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String URI = request.getRequestURI().replaceAll("/InterviewProject/","");

        PrintWriter out =response.getWriter();

        switch (URI){
            case "addStudent":
            String studentName = request.getParameter("studentName");
            int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
            Student student = new Student();
            student.setPhoneNumber(phoneNumber);
            student.setStudentName(studentName);
            serviceDao.addStudents(student);
            break;

            case "addSubject":
            String subjectName = request.getParameter("subjectName");
                Subject subject = new Subject();
                subject.setSubjectName(subjectName);
                serviceDao.addSubjects(subject);
                break;

            case "addMarks":
             int subjectId  = Integer.parseInt(request.getParameter("subjectId"));
             int subjectmarks = Integer.parseInt(request.getParameter("marks"));
             Marks marks = new Marks();
             marks.setMarks(subjectmarks);
             marks.setSubjectId(subjectId);
             serviceDao.addMarks(marks);
             break;

            case "displayStudents":
                studentDao.displayallStudents(request, response);

            default:
                out.println("Error Occured");




        }


    }
}
