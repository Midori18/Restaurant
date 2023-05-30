module com.examjava.restaurant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.examjava.restaurant to javafx.fxml;
    exports com.examjava.restaurant;
}