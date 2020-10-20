package castudy.contrller;

import castudy.dao.LoginDAO;
import castudy.dao.ManagementProductVendorDAO;
import castudy.dao.ManagementProductsDAO;
import castudy.dao.TrangChu;
import castudy.model.Blog;
import castudy.model.Product;
import castudy.model.ProductVendor;
import castudy.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private static TrangChu trangChu=new TrangChu();
    private static ManagementProductVendorDAO managementProductVendorDAO=new ManagementProductVendorDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "customer":
                    loginCustomer(request,response);
                    break;
                default:
                    loginAdmin(request, response);
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "loginOut":
                    loginOutCustomer(request,response);
                    break;
                case "out":
                    loginOut(request,response);
                    break;
                default:
                    showFormLogin(request, response);
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showFormLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/login.jsp");
        dispatcher.forward(request,response);
    }

    private void loginOut(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        HttpSession session = request.getSession();
        session.setAttribute("user",null);
        request.setAttribute("account",null);
        RequestDispatcher dispatcher=request.getRequestDispatcher("user/login.jsp");
        dispatcher.forward(request,response);
    }

    private void loginAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        HttpSession session=request.getSession();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        LoginDAO loginDAO=new LoginDAO();
        User user=loginDAO.checkLoginAdmin(userName,password);
        session.setAttribute("user",user);

        if(user==null){
            request.setAttribute("message", "<script>\n" +
                    "        alert(\"Login fail \")\n" +
                    "    </script>");
            RequestDispatcher dispatcher=request.getRequestDispatcher("user/login.jsp");
            dispatcher.forward(request,response);
        }else {
            response.sendRedirect("/products");
        }
    }
    private void loginCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        HttpSession session=request.getSession();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        LoginDAO loginDAO=new LoginDAO();
        User userCustomer=loginDAO.checkLoginCustomer(userName,password);
        session.setAttribute("user",userCustomer);

        List<Product> product12ProductHome = trangChu.select12ProductHome();
        request.setAttribute("product12ProductHome", product12ProductHome);

        List<Product> productHot = trangChu.selectHotProduct();
        request.setAttribute("productHot",productHot);

        List<ProductVendor> productVendors=managementProductVendorDAO.selectAll();
        request.setAttribute("productVendors",productVendors);

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        List<Blog> blog3List=trangChu.selectAmountBlog(3);
        request.setAttribute("blog3List",blog3List);

        if(userCustomer==null){
            request.setAttribute("message", "<script>\n" +
                    "        alert(\"Login fail \")\n" +
                    "    </script>");
        }else {
            request.setAttribute("message", "<script>\n" +
                    "        alert(\"Logged in successfully  \")\n" +
                    "    </script>");
        }

        RequestDispatcher dispatcher=request.getRequestDispatcher("trangchu/home.jsp");
        dispatcher.forward(request,response);
    }

    private void loginOutCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        HttpSession session = request.getSession();
        session.setAttribute("user",null);
        request.setAttribute("user",null);

        List<Product> product12ProductHome = trangChu.select12ProductHome();
        request.setAttribute("product12ProductHome", product12ProductHome);

        List<Product> productHot = trangChu.selectHotProduct();
        request.setAttribute("productHot",productHot);

        List<ProductVendor> productVendors=managementProductVendorDAO.selectAll();
        request.setAttribute("productVendors",productVendors);

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        List<Blog> blog3List=trangChu.selectAmountBlog(3);
        request.setAttribute("blog3List",blog3List);

        RequestDispatcher dispatcher=request.getRequestDispatcher("trangchu/home.jsp");
        dispatcher.forward(request,response);
    }

}
