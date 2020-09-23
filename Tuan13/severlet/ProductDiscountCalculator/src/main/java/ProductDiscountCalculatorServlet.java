import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/product")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product=request.getParameter("Product_Description");
        float discount=Float.parseFloat(request.getParameter("List_Price")) ;
        float price=Float.parseFloat(request.getParameter("Discount_Percent"));
        double Amount = price * discount * 0.01;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1 style=\"color: red;\">Product Description:"+product+"</h1>");
        writer.println("<h1 style=\"color: red;\">List Price:"+price+"</h1>");
        writer.println("<h1 style=\"color: red;\">Discount Percent:"+discount+"</h1>");
        writer.println("<h1 style=\"color: red;\">Discount Amount:"+Amount+"</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
