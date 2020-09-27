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
import java.io.PrintWriter;

@WebServlet(name = "AddServlet", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    private CustomerServiceIpl customerServiceIpl=new CustomerServiceIpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String email=request.getParameter("Email");
        String id=request.getParameter("Id");
        if (id!=""){
            int key=Integer.parseInt(id);
            Customer customer=customerServiceIpl.findById(key);
            customer.setEmail(email);
            customer.setAddress(address);
            customer.setName(name);
//            chua check lai mail khi edit
            customerServiceIpl.update(key,customer);
            response.sendRedirect("/view");
        }else {
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
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id1=request.getParameter("IdDelete");
        String id2=request.getParameter("IdEdit");
        if (id1!=null){
            int idDelete=Integer.parseInt(id1);
            customerServiceIpl.remove(idDelete);
            response.sendRedirect("/view");
        }
        if (id2!=null){
            int idEdit=Integer.parseInt(id2);
            RequestDispatcher dispatcher=request.getRequestDispatcher("/add.jsp");
            Customer customer=customerServiceIpl.findById(idEdit);
            request.setAttribute("customer",customer);
            dispatcher.forward(request,response);
        }
    }
}
