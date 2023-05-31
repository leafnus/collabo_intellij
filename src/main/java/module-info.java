module com.soo.soo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.soo to javafx.fxml;
    exports com.soo;
}