package com.ijse.samsproject.sams.Dao;

import com.ijse.samsproject.sams.Entity.AdminEntity;

import java.util.List;

public interface AdminDao {
    void save(AdminEntity admin);
    void update(AdminEntity admin);
    void delete(String adminId);
    AdminEntity findById(String adminId);
    List<AdminEntity> findAll();
}
