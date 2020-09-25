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
    private Map<String,String> dictionary=new HashMap<>();
    private boolean check = true;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(check) {
            dictionary.put("hello", "Xin chào");
            dictionary.put("how", "Thế nào");
            dictionary.put("book", "Quyển vở");
            dictionary.put("computer", "Máy tính");
            check = false;
        }
        String search = request.getParameter("txtSearch");

        String key=request.getParameter("txtAddKey");
        String value=request.getParameter("txtAddValue");

        PrintWriter writer = response.getWriter();
        String result=null;
        writer.println("<html>");
        if (key!=null &&dictionary.containsKey(key)){
            writer.println("<h2>Not add key</h2>");
        }else if (key!=""){
            dictionary.put(key, value);
            writer.println("<h2>Add key: </h2>");
            writer.println("<h2>Word: " + key+"</h2>");
            writer.println("<h2>Result: " +value+"</h2>");
        }
        if(search !=null&&dictionary.containsKey(search)){
            result=dictionary.get(search);
            writer.println("<h2>Word: " + search+"</h2>");
            writer.println("<h2>Result: " + result+"</h2>");
        } else if (search !=""){
                writer.println("<h2>Not found</h2>");
        }
        writer.println("<h2><a href=\"index.jsp\">Tiep tuc</a></h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
