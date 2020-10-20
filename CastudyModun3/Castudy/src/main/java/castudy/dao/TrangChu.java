package castudy.dao;

import castudy.model.Blog;
import castudy.model.Product;
import castudy.model.ProductLine;
import castudy.model.ProductVendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangChu extends Connections {
    private static ManagementProductLinesDAO managementProductLinesDAO=new ManagementProductLinesDAO();
    private static ManagementProductVendorDAO managementProductVendorDAO=new ManagementProductVendorDAO();
    private  static ManagementProductsDAO managementProductsDAO=new ManagementProductsDAO();
    private  static  ManagementBlogDAO managementBlogDAO=new ManagementBlogDAO();



    private static final String SELECT_12_PRODUCT_HOME ="SELECT * FROM castudy.product limit 12;";
    private static final String SELECT_THREE_PRODUCT_HOT ="SELECT * FROM castudy.product order by soLuongMua desc limit 3;";
    private static final String SELECT_10_NEW_PRODUCT ="SELECT * FROM castudy.product order by maSanPham desc limit 10;";
    private static final String SELECT_ALL_TYPE = "SELECT loaiSanPham FROM castudy.product group by loaiSanPham;";
    private static final String SELECT_PRICE_MAX_MIN = "SELECT max(giaSanPham) as priceMax, min(giaSanPham) as priceMin FROM castudy.product;";
    private static final String SELECT_PRODUCT_BY_TYPE = "SELECT * FROM castudy.product where loaiSanPham=?;";
    private static final String SELECT_SO_LUONG_BLOG="SELECT * FROM castudy.blog order by id limit ?;";




    public List<Product> select12ProductHome() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_12_PRODUCT_HOME)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int maSanPham = rs.getInt("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                float giaSanPham  = rs.getFloat("giaSanPham");
                String image=rs.getString("image");
                String mauSac=rs.getString("mauSac");
                int soLuong = rs.getInt("soLuong");
                String ngaySanXuat=rs.getString("ngaySanXuat");
                String hanSudung=rs.getString("hanSudung");
                String moTa=rs.getString("moTa");
                int soLuongMua=rs.getInt("soLuongMua");
                int maTheLoai = rs.getInt("maTheLoai");
                ProductLine productLine=managementProductLinesDAO.selectOne(maTheLoai);
                int maNhaSanXuat = rs.getInt("maNhaSanXuat");
                ProductVendor productVendor=managementProductVendorDAO.selectOne(maNhaSanXuat);

                products.add(new Product(maSanPham, tenSanPham, giaSanPham,image,mauSac,productLine,productVendor,soLuong,ngaySanXuat,hanSudung,moTa,soLuongMua,maTheLoai,maNhaSanXuat));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> selectHotProduct() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_THREE_PRODUCT_HOT)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int maSanPham = rs.getInt("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                float giaSanPham  = rs.getFloat("giaSanPham");
                String image=rs.getString("image");
                String mauSac=rs.getString("mauSac");
                int soLuong = rs.getInt("soLuong");
                String ngaySanXuat=rs.getString("ngaySanXuat");
                String hanSudung=rs.getString("hanSudung");
                String moTa=rs.getString("moTa");
                int soLuongMua=rs.getInt("soLuongMua");
                int maTheLoai = rs.getInt("maTheLoai");
                ProductLine productLine=managementProductLinesDAO.selectOne(maTheLoai);
                int maNhaSanXuat = rs.getInt("maNhaSanXuat");
                ProductVendor productVendor=managementProductVendorDAO.selectOne(maNhaSanXuat);

                products.add(new Product(maSanPham, tenSanPham, giaSanPham,image,mauSac,productLine,productVendor,soLuong,ngaySanXuat,hanSudung,moTa,soLuongMua,maTheLoai,maNhaSanXuat));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Product> selectTenNewProduct() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_10_NEW_PRODUCT)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int maSanPham = rs.getInt("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                float giaSanPham  = rs.getFloat("giaSanPham");
                String image=rs.getString("image");
                String mauSac=rs.getString("mauSac");
                int soLuong = rs.getInt("soLuong");
                String ngaySanXuat=rs.getString("ngaySanXuat");
                String hanSudung=rs.getString("hanSudung");
                String moTa=rs.getString("moTa");
                int soLuongMua=rs.getInt("soLuongMua");
                int maTheLoai = rs.getInt("maTheLoai");
                ProductLine productLine=managementProductLinesDAO.selectOne(maTheLoai);
                int maNhaSanXuat = rs.getInt("maNhaSanXuat");
                ProductVendor productVendor=managementProductVendorDAO.selectOne(maNhaSanXuat);

                products.add(new Product(maSanPham, tenSanPham, giaSanPham,image,mauSac,productLine,productVendor,soLuong,ngaySanXuat,hanSudung,moTa,soLuongMua,maTheLoai,maNhaSanXuat));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<String> selectAllType() {
        List<String> list = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String tenTheLoai=rs.getString("loaiSanPham");
                list.add(tenTheLoai);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return list;
    }

    public List<Integer> selectPriceMaxMin() {
        List<Integer> list = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRICE_MAX_MIN)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Integer priceMax =rs.getInt("priceMax");
                Integer priceMin =rs.getInt("priceMin");
                list.add(priceMax);
                list.add(priceMin);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return list;
    }

    public List<Product> selectListProductByType(String tenTheLoai) {
        List<Product> products = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_TYPE)) {
            preparedStatement.setString(1, tenTheLoai);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int maSanPham = rs.getInt("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                float giaSanPham  = rs.getFloat("giaSanPham");
                String image=rs.getString("image");
                String mauSac=rs.getString("mauSac");
                int soLuong = rs.getInt("soLuong");
                String ngaySanXuat=rs.getString("ngaySanXuat");
                String hanSudung=rs.getString("hanSudung");
                String moTa=rs.getString("moTa");
                int soLuongMua=rs.getInt("soLuongMua");
                int maTheLoai = rs.getInt("maTheLoai");
                ProductLine productLine=managementProductLinesDAO.selectOne(maTheLoai);
                int maNhaSanXuat = rs.getInt("maNhaSanXuat");
                ProductVendor productVendor=managementProductVendorDAO.selectOne(maNhaSanXuat);

                products.add(new Product(maSanPham, tenSanPham, giaSanPham,image,mauSac,productLine,productVendor,soLuong,ngaySanXuat,hanSudung,moTa,soLuongMua,maTheLoai,maNhaSanXuat));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return products;
    }

    public List<Blog> selectAmountBlog(int soLuong) {
        List<Blog> blogList = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SO_LUONG_BLOG)) {
            preparedStatement.setInt(1, soLuong);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String link = rs.getString("link");
                String image=rs.getString("image");

                blogList.add(new Blog(id,title,link,image));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return blogList;
    }

}
