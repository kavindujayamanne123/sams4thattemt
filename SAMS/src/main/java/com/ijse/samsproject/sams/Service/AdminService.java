package com.ijse.samsproject.sams.Service;

import com.ijse.samsproject.sams.Entity.AdminEntity;

import java.util.List;

public interface AdminService {
    void addAdmin(AdminEntity admin);
    void updateAdmin(AdminEntity admin);
    void deleteAdmin(String adminID);
    List<AdminEntity> getAllAdmins();
}
