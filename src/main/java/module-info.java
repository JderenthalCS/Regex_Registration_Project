module com.example.csc311_mod_6_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_mod_6_assignment to javafx.fxml;
    exports com.example.csc311_mod_6_assignment;
}