module eus.ehu.eui.demoberria {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.eui.demoberria to javafx.fxml;
    exports eus.ehu.eui.demoberria;
}