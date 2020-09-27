package controller;

import model.Customer;
import service.CustomerServiceIpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddServlet", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    private CustomerServiceIpl customerServiceIpl=new CustomerServiceIpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String email=request.getParameter("Email");
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        if (customerServiceIpl.checkEmail(email)){
            writer.println("<h2>Email da ton tai</h2>");
            writer.println("<a style=\"color: dodgerblue\" href=\"/view\">Back view</a>");
            writer.println("<a style=\"color: dodgerblue\" href=\"add.jsp\">Back add</a>");
        }else{
            Customer customer=new Customer(name,address,email);
            customerServiceIpl.save(customer);
            response.sendRedirect("/view");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("Id"));
        customerServiceIpl.remove(id);
        response.sendRedirect("/view");
    }
}
