package severice;

import entity.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/index")
public class Servlet extends HttpServlet {
    private List<Customer> list=new ArrayList<>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        list=ListCustomerService.customers ;
        request.setAttribute("list",list);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request,response);
    }
}