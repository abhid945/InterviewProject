package com.coditas.dao;

import com.coditas.controller.ServiceDao;
import com.coditas.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class StudentDao  extends HttpServlet {

    ServiceDao serviceDao = new ServiceDao();
    public List<Student> displayallStudents(HttpServletRequest request ,HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        List<Student> studentList =serviceDao.displayStudents();
        Iterator iterator= studentList.iterator();
        out.println("<table border='2'><thead><th>Id/th><th>Name</th><th>PhoneNumber</th><th>username</th><th></th></head><tbody>  ");
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();

        }
        out.println("</table>");

        return studentList;


    }
}
