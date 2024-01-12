module com.example.notes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.notes to javafx.fxml;
    exports com.example.notes;
    exports com.example.notes.Controllers;
    opens com.example.notes.Controllers to javafx.fxml;
}