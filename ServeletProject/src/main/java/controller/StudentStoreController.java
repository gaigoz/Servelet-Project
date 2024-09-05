package controller;

import bean.Student;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentStoreController")
public class StudentStoreController extends HttpServlet {
    private final long serialVersionUID = 1L;

    public StudentStoreController() {}

    protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int bId = Integer.parseInt(request.getParameter("bId"));

        Student student = new Student(name, age, bId);

        StudentService studentService = new StudentService();
        String result = studentService.storeStudent(student);
        pw.println(result);
        RequestDispatcher rd = request.getRequestDispatcher("create_student.jsp");
        response.setContentType("text/html");
        rd.include(request, response);

    }

}
