package org.InterfataGrafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {
        Button button = new Button("Button for a message");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);

        Scene scene = new Scene(componentGroup);
        window.setScene(scene);

        window.setTitle("Bun venit");
        window.show();
    }

    static public void main (String[] args) {
        launch(JavaFxApplication.class);
    }
}
