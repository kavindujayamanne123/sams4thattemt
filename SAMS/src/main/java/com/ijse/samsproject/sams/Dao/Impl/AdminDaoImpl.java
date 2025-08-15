package com.ijse.samsproject.sams.Dao.Impl;

import com.ijse.samsproject.sams.DBConnection.DBConnection;
import com.ijse.samsproject.sams.Dao.AdminDao;
import com.ijse.samsproject.sams.Entity.AdminEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    private final Connection connection = DBConnection.getInstance().getConnection();

    public AdminDaoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void save(AdminEntity admin) {
        String sql = "INSERT INTO admins(username,password) VALUES (adminID,firstName,lastName,email,AddressLine1,AddressLine2,AddressLine3,city,contact,password)";
        try (PreparedStatement pst = connection.prepareStatement(sql) ){
            pst.setString(1, admin.getAdminID());
            pst.setString(2, admin.getFirstName());
            pst.setString(3, admin.getLastName());
            pst.setString(4, admin.getEmail());
            pst.setString(5, admin.getAddressLine1());
            pst.setString(6, admin.getAddressLine2());
            pst.setString(7, admin.getAddressLine3());
            pst.setString(8, admin.getCity());
            pst.setString(9, admin.getContact());
            pst.setString(10, admin.getPassword());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(AdminEntity admin) {
        String sql = "UPDATE admins SET firstName =?,lastName =?,email =?,AddressLine1 =?,AddressLine2 =?,AddressLine3 =?,city =?,contact =?,password =? WHERE adminID =?";
        try(PreparedStatement pst = connection.prepareStatement(sql)){
            pst.setString(1, admin.getFirstName());
            pst.setString(2, admin.getLastName());
            pst.setString(3, admin.getEmail());
            pst.setString(4, admin.getAddressLine1());
            pst.setString(5, admin.getAddressLine2());
            pst.setString(6, admin.getAddressLine3());
            pst.setString(7, admin.getCity());
            pst.setString(8, admin.getContact());
            pst.setString(9, admin.getPassword());
            pst.setString(10, admin.getAdminID());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String adminId) {
        String sql = "DELETE FROM admins WHERE adminID =?";
        try(PreparedStatement pst = connection.prepareStatement(sql)){
            pst.setString(1,adminId);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public AdminEntity findById(String adminId) {
        String sql = "SELECT * FROM admins WHERE adminID =?";
        try(PreparedStatement pst = connection.prepareStatement(sql)){
            pst.setString(1,adminId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                return new AdminEntity(
                        rs.getString("adminID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("AddressLine1"),
                        rs.getString("AddressLine2"),
                        rs.getString("AddressLine3"),
                        rs.getString("city"),
                        rs.getString("contact"),
                        rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AdminEntity> findAll() {
        List<AdminEntity> list = new ArrayList<>();
        String sql = "SELECT * FROM admins";
        try(Statement statement = connection.createStatement();
            ResultSet rst = statement.executeQuery(sql)){
            while (rst.next()){
                AdminEntity admin = new AdminEntity(
                        rst.getString("adminID"),
                        rst.getString("firstName"),
                        rst.getString("lastName"),
                        rst.getString("email"),
                        rst.getString("AddressLine1"),
                        rst.getString("AddressLine2"),
                        rst.getString("AddressLine3"),
                        rst.getString("city"),
                        rst.getString("contact"),
                        rst.getString("password")
                );
                list.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
