package severlet;

import model.Customer;
import service.CustomerSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EditServlet" ,urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String email=request.getParameter("Email");
        int id=Integer.parseInt(request.getParameter("Id"));
        CustomerSevice customerSevice=new CustomerSevice();
        customerSevice.edit(name,address,email,id);
        response.sendRedirect("view.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
