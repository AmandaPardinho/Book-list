module com.example.bookinterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookinterface to javafx.fxml;
    exports com.example.bookinterface;
}