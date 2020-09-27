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

@WebServlet(name = "EditServlet",urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    private CustomerServiceIpl customerServiceIpl=new CustomerServiceIpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String email=request.getParameter("Email");
        int id=Integer.parseInt(request.getParameter("Id"));
//        chua xu li null
        Customer customer=customerServiceIpl.findById(id);
        customer.setName(name);
        customer.setAddress(address);
        customer.setEmail(email);
        customerServiceIpl.update(id,customer);
        response.sendRedirect("/view");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/edit.jsp");
        int id=Integer.parseInt(request.getParameter("Id"));
        Customer customer=customerServiceIpl.findById(id);
        request.setAttribute("customer",customer);
        dispatcher.forward(request,response);
    }
}
