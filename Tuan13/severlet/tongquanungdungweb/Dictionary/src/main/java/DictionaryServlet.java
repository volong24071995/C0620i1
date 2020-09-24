import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet",urlPatterns = "/search_and_add")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("txtSearch");

        String key=request.getParameter("txtAddKey");
        String value=request.getParameter("txtAddValue");

        PrintWriter writer = response.getWriter();
        String result=null;

        writer.println("<html>");
        if (key!=null &&dictionary.containsKey(key)){
            writer.println("Not add key");
        }else if (key!=""){
            dictionary.put(key, value);
            writer.println("Add key: ");
            writer.println("Word: " + key);
            writer.println("Result: " +value);
        }
        if(search !=null&&dictionary.containsKey(search)){
            result=dictionary.get(search);
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else if (search !=""){
                writer.println("Not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
