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

@WebServlet(name = "AddServlet",urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    private CustomerSevice customerSevice=new CustomerSevice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("FullName");
        String address=request.getParameter("Address");
        String email=request.getParameter("Email");

        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        if (customerSevice.checkEmail(email)){
            writer.println("<h2>Email da ton tai</h2>");
            writer.println("<a style=\"color: dodgerblue\" href=\"view.jsp\">Back view</a>");
            writer.println("<a style=\"color: dodgerblue\" href=\"add.jsp\">Back add</a>");
        }else{
            customerSevice.add(name,address,email);
            response.sendRedirect("view.jsp");
        }
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int idDelete = Integer.parseInt(request.getParameter("idDelete"));
            customerSevice.delete(idDelete);
            response.sendRedirect("view.jsp");

    }
}
