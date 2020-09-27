package controller;

import model.Customer;
import service.CustomerServiceIpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewServlet", urlPatterns = "/view")
public class ViewServlet extends HttpServlet {
    private CustomerServiceIpl customerServiceIpl=new CustomerServiceIpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/view.jsp");
        List<Customer> list= customerServiceIpl.findAll();
        request.setAttribute("list",list);
        dispatcher.forward(request,response);
    }
}
