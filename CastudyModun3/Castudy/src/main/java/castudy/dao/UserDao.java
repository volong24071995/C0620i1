package castudy.dao;

import castudy.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends Connections implements IManagementDAO<User> {
    private static final String INSERT_ACCOUNT="INSERT INTO `castudy`.`user` (`userName`,`password`,`chucvu`,`email`) VALUES(?,?,?,?);";

    @Override
    public void insert(User account) throws SQLException {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT)) {
            preparedStatement.setString(1, account.getUserName());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getChucVu());
            preparedStatement.setString(4, account.getEmail());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public User selectOne(int id) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(User element) throws SQLException {
        return false;
    }
}
