module com.example.javaminesweeper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaminesweeper to javafx.fxml;
    exports com.example.javaminesweeper;
}