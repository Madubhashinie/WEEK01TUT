module org.example.loginform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.loginform to javafx.fxml;
    exports org.example.loginform;
}