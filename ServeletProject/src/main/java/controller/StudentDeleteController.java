package controller;

import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentDeleteController")
public class StudentDeleteController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("sid"));

        StudentService studentService = new StudentService();
        String result = studentService.deleteStudent(id);
        pw.println(result);

        // created request dispatcher object and include the page
        RequestDispatcher rd = request.getRequestDispatcher("delete_student.jsp");

        response.setContentType("text/html");
        rd.include(request, response);
    }
}
