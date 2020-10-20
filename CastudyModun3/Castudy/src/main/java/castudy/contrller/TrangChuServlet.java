package castudy.contrller;

import castudy.dao.ManagementProductLinesDAO;
import castudy.dao.ManagementProductVendorDAO;
import castudy.dao.ManagementProductsDAO;
import castudy.dao.TrangChu;
import castudy.model.*;

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

@WebServlet(name = "TrangChuServlet",urlPatterns = "/TrangChu")
public class TrangChuServlet extends HttpServlet {

    private ManagementProductsDAO managementProductsDAO =new ManagementProductsDAO();
    private TrangChu trangChu=new TrangChu();
    private ManagementProductLinesDAO managementProductLinesDAO=new ManagementProductLinesDAO();
    private ManagementProductVendorDAO managementProductVendorDAO=new ManagementProductVendorDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "search":
                    searchProduct(request,response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
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
                case "view":
                    viewProduct(request,response);
                    break;
                case "blog":
                    blog(request, response);
                    break;
                case "contact":
                    contact(request, response);
                    break;
                case "productLine":
                    showListProductByType(request, response);
                    break;
                case "shop":
                    shop(request,response);
                    break;
                default:
                    home(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void home(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

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

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);

        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/home.jsp");
        dispatcher.forward(request, response);
    }

    private void shop(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        List<Product> productHot = trangChu.selectHotProduct();
        request.setAttribute("productHot",productHot);

        List<Product> newProducts = trangChu.selectTenNewProduct();
        request.setAttribute("newProducts", newProducts);

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        List<Integer> prices=trangChu.selectPriceMaxMin();
        request.setAttribute("priceMax",prices.get(0));
        request.setAttribute("priceMin",prices.get(1));

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);

        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/shop.jsp");
        dispatcher.forward(request, response);
    }

    private void contact(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);

        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/contact.jsp");
        dispatcher.forward(request, response);
    }

    private void blog(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        List<Blog> blog3List=trangChu.selectAmountBlog(6);
        request.setAttribute("blog6List",blog3List);

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);

        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/blog.jsp");
        dispatcher.forward(request, response);
    }


    private void showListProductByType(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tenTheLoai=request.getParameter("tenTheLoai");
        List<Product> productList=trangChu.selectListProductByType(tenTheLoai);
        request.setAttribute("productList",productList);

        Product representative=productList.get(0);
        request.setAttribute("representative",representative);

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);


        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/viewListProductProductLines.jsp");
        dispatcher.forward(request, response);
    }


    private void searchProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {

        String name=request.getParameter("name");
        List<Product> productList=managementProductsDAO.searchProduct(name);
        if (productList.size()>0){
            request.setAttribute("productList",productList);

            Product representative=productList.get(0);
            request.setAttribute("representative",representative);

            List<String> list=trangChu.selectAllType();
            request.setAttribute("tenTheLoai",list);

            HttpSession session = request.getSession();
            User account = (User) session.getAttribute("user");
            request.setAttribute("user",account);

            RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/viewListProductProductLines.jsp");
            dispatcher.forward(request, response);
        }else {
            response.sendRedirect("/TrangChu");
        }
    }
    private void viewProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int  maTheLoai=Integer.parseInt(request.getParameter("id"));
        Product representative=managementProductsDAO.selectOne(maTheLoai);
        request.setAttribute("representative",representative);

        List<Product> productList=managementProductsDAO.selectAll();
        request.setAttribute("productList",productList);

        List<String> list=trangChu.selectAllType();
        request.setAttribute("tenTheLoai",list);

        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        request.setAttribute("user",account);

        RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu/viewListProductProductLines.jsp");
        dispatcher.forward(request, response);
    }
}
