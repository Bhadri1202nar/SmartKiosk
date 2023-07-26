module com.example.semesterpackage {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;
    requires java.sql;

    opens com.example.semesterpackage to javafx.fxml;
    exports com.example.semesterpackage;
}