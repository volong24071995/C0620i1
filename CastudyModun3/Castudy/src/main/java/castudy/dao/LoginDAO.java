package castudy.dao;

import castudy.model.Product;
import castudy.model.ProductLine;
import castudy.model.ProductVendor;
import castudy.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO extends Connections {

    private static final String SELECT_USER="SELECT * FROM castudy.user where userName =? and password=?;";

    public User checkLoginAdmin(String userName,String password) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER)) {
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String chucVu=rs.getString("chucvu");
                String email=rs.getString("email");
                User user = new User(userName, password,email,chucVu);
                if(chucVu.equals("admin")){
                    return user;
                }else return null;
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }

    public User checkLoginCustomer(String userName,String password){
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER)) {
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String chucVu=rs.getString("chucvu");
                String email=rs.getString("email");
                User user = new User(userName,password,email,chucVu);
                return user;
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }
}
