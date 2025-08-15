module com.ijse.samsproject.sams {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ijse.samsproject.sams.View to javafx.fxml;
    exports com.ijse.samsproject.sams;
}