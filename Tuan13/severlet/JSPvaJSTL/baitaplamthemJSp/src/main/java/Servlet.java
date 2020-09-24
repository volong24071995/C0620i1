import Entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet",urlPatterns ="/login")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Customer> list=new HashMap<>();

        Customer customer1=new Customer("Le Hiep","Hiepdaica@gmail.com");
        Customer customer2=new Customer("Do Chanh Tin","TindanemChiTai@gmail.com");
        Customer customer3=new Customer("Do Nguyen Duong","Nguyenduong123@gmail.com");

        list.put("Hiepdaica@gmail.com",customer1);
        list.put("TindanemChiTai@gmail.com",customer2);
        list.put("Nguyenduong123@gmail.com",customer3);

        Map<String,String> account=new HashMap<>();
        account.put("Hiepdaica@gmail.com","123456");
        account.put("TindanemChiTai@gmail.com","123456");
        account.put("Nguyenduong123@gmail.com","123456");

        String user=request.getParameter("username");
        String pass=request.getParameter("password");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        if (account.containsKey(user)){
            if (pass.equals(account.get(user))){
                String name=list.get(user).getName();
                writer.println("<h3>Dang nhap thanh cong.Chao "+name+"</h3>");
            }else {
                writer.println("<h3>Sai pass</h3>");
            }
        }else if (account.containsValue(pass)){
            writer.println("<h3>Sai username</h3>");
        }else {
            writer.println("<h3>Sai username and sai pass</h3>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
