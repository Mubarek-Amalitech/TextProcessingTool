module org.amalitech.demo {
    requires javafx.controls;
    requires javafx.fxml;

    // Export application entry-point package
    exports org.amalitech.demo;

    // Open packages for reflection by JavaFX FXMLLoader
    opens org.amalitech.demo to javafx.graphics;
    opens org.amalitech.demo.Controller to javafx.fxml;

    // Optional: Open additional packages if required for reflection
    opens org.amalitech.demo.Processor to javafx.fxml;
    //opens org.amalitech.demo.Data to javafx.fxml;
    opens  org.amalitech.demo.Data  to javafx.base;

}
