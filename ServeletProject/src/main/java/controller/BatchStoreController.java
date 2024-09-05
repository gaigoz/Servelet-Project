package controller;

import bean.Batch;
import service.BatchService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BatchStoreController")
public class BatchStoreController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String typeOfBatch = request.getParameter("typeOfBatch");
        String time = request.getParameter("time");

        Batch batch = new Batch( typeOfBatch, time);

        BatchService batchService = new BatchService();
        String result = batchService.storeBatch(batch);
        pw.println(result);
        RequestDispatcher rd = request.getRequestDispatcher("create_batch.jsp");
        response.setContentType("text/html");
        rd.include(request, response);
    }
}
