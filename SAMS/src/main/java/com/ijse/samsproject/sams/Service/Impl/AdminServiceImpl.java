package com.ijse.samsproject.sams.Service.Impl;

import com.ijse.samsproject.sams.Dao.AdminDao;
import com.ijse.samsproject.sams.Dao.Impl.AdminDaoImpl;
import com.ijse.samsproject.sams.Entity.AdminEntity;
import com.ijse.samsproject.sams.Service.AdminService;

import java.sql.SQLException;
import java.util.List;

public class AdminServiceImpl implements AdminService {

    private final AdminDao adminDao = new AdminDaoImpl();

    public AdminServiceImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addAdmin(AdminEntity admin) {
        adminDao.save(admin);
    }

    @Override
    public void updateAdmin(AdminEntity admin) {
        adminDao.update(admin);
    }

    @Override
    public void deleteAdmin(String adminID) {
        adminDao.delete(adminID);
    }

    @Override
    public List<AdminEntity> getAllAdmins() {
        return adminDao.findAll();
    }
}
