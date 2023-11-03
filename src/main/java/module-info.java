module com.example.grasshopperfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grasshopperfx to javafx.fxml;
    exports com.example.grasshopperfx;
}