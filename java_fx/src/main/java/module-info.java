module com.arpit {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arpit to javafx.fxml;
    exports com.arpit;
}
