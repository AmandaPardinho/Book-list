module booklist.java.bookinterface {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens booklist.java.bookinterface to javafx.fxml;
    exports booklist.java.bookinterface;
}