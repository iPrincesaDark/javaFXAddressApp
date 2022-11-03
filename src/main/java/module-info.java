module br.com.appdahora.javafxaddressapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.prefs;
    requires java.xml.bind;

    opens br.com.appdahora.javafxaddressapp to javafx.fxml;
    exports br.com.appdahora.javafxaddressapp;
    exports br.com.appdahora.javafxaddressapp.model;
    opens br.com.appdahora.javafxaddressapp.model to javafx.fxml;
    exports br.com.appdahora.javafxaddressapp.view;
    opens br.com.appdahora.javafxaddressapp.view to javafx.fxml;
}