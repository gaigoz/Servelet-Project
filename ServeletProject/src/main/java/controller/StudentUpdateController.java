package controller;

import bean.Student;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentUpdateController")
public class StudentUpdateController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        int sId = Integer.parseInt(request.getParameter("sid"));
        String name = request.getParameter("sname");


        Student student = new Student();
        student.setsId(sId);
        student.setName(name);

        StudentService studentService = new StudentService();
        String result = studentService.updateStudent(student);
        pw.println(result);

        RequestDispatcher rd = request.getRequestDispatcher("update_student.jsp");
        response.setContentType("text/html");
        rd.include(request, response);

    }

    ;
}
