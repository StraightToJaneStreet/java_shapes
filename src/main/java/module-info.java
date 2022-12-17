module com.z7.editor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.z7.editor to javafx.fxml;
    exports com.z7.editor;
}