package com.ijse.samsproject.sams.View;

import com.ijse.samsproject.sams.Entity.AdminEntity;
import com.ijse.samsproject.sams.Service.AdminService;
import com.ijse.samsproject.sams.Service.Impl.AdminServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;
import java.util.List;

public class AdminView {

    private final AdminService adminService = new AdminServiceImpl();

    public AnchorPane ancAdmin;

    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtEmail;
    public TextField txtAddressLine1;
    public TextField txtAddressLine2;
    public TextField txtCity;
    public TextField txtAddressLine3;
    public TableView<AdminEntity> tblAdmin;
    public TableColumn<AdminEntity,String> clmAdminId;
    public TableColumn<AdminEntity,String> clmFirstName;
    public TableColumn<AdminEntity,String> clmLastName;
    public TableColumn<AdminEntity,String> clmEmail;
    public TableColumn<AdminEntity,String> clmAddress1;
    public TableColumn<AdminEntity,String> clmAddress2;
    public TableColumn<AdminEntity,String> clmStream;
    public TableColumn<AdminEntity,String> clmCity;
    public TableColumn<AdminEntity,String> clmContactNumer;
    public TableColumn<AdminEntity,String> clmPassword;
    public TextField txtContact;
    public TextField txtPassword;
    public TextField txtAdminID;

    public void Initialize(){
        clmAdminId.setCellValueFactory(new PropertyValueFactory<>("adminID"));
        clmFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        clmLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        clmEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        clmAddress1.setCellValueFactory(new PropertyValueFactory<>("AddressLine1"));
        clmAddress2.setCellValueFactory(new PropertyValueFactory<>("AddressLine2"));
        clmStream.setCellValueFactory(new PropertyValueFactory<>("AddressLine3"));
        clmCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        clmContactNumer.setCellValueFactory(new PropertyValueFactory<>("contact"));
        clmPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
    }

    public AdminView() throws SQLException, ClassNotFoundException {
    }

    public void btnAdd(ActionEvent actionEvent) {
        AdminEntity admin =   new AdminEntity(
                txtAdminID.getText(),
                txtFirstName.getText(),
                txtLastName.getText(),
                txtEmail.getText(),
                txtAddressLine1.getText(),
                txtAddressLine2.getText(),
                txtAddressLine3.getText(),
                txtCity.getText(),
                txtContact.getText(),
                txtPassword.getText()
        );
        adminService.addAdmin(admin);
        System.out.println("Admin Added successfully");
    }

    public void btnDelete(ActionEvent actionEvent) {
    }

    public void btnUpdate(ActionEvent actionEvent) {
    }

    public void btnView(ActionEvent actionEvent) {
        List<AdminEntity> adminList = adminService.getAllAdmins();
        ObservableList<AdminEntity> observableList = FXCollections.observableArrayList(adminList);
        tblAdmin.setItems(observableList);
    }
}
