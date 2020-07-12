module ru.specialist {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.specialist to javafx.fxml;
    exports ru.specialist;
}