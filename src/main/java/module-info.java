module com.example.javaminesweeper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.javaminesweeper.gui to javafx.fxml;
    exports com.example.javaminesweeper.gui;
}