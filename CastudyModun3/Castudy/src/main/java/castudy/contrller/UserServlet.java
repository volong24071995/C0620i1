package castudy.contrller;

import castudy.dao.*;
import castudy.model.*;
import castudy.service.Validations;

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

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    UserDao userDao=new UserDao();
    TrangChu trangChu=new TrangChu();
    ManagementProductVendorDAO managementProductVendorDAO=new ManagementProductVendorDAO();
    ManagementProductsDAO managementProductsDAO=new ManagementProductsDAO();
    ManagementProductLinesDAO managementProductLinesDAO=new ManagementProductLinesDAO();
    Validations validations=new Validations();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                default:
                    createAccount(request,response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void createAccount(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

            String userName = request.getParameter("name");
            String password=request.getParameter("pass");
            String email=request.getParameter("email");
            if (validations.validateUser(userName,password,email)){
                User account=new User(userName,password,email,"customer");
                HttpSession session=request.getSession();
                userDao.insert(account);
                request.setAttribute("account",account);
                session.setAttribute("user",account);
                request.setAttribute("message", "<script>\n" +
                        "        alert(\"Created\")\n" +
                        "    </script>");
            }else {
                request.setAttribute("message", "<script>\n" +
                        "        alert(\"No created.Not validate\")\n" +
                        "    </script>");
            }
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

            RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/home.jsp");
            dispatcher.forward(request, response);

    }
}
