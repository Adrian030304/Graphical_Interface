package org.InterfataGrafica;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {

        Label textComponent = new Label("Textul acesta este folosit pentru label ");
        Button button = new Button("Button for a message");

        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORD"));
        layout.setBottom(new Label("SOUTH"));
        layout.setLeft(new Label("WEST"));
        layout.setRight(new Label("EAST"));

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(button);

//        layout.setCenter(componentGroup);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);

        window.setTitle("Bun venit");
        window.show();
    }

    static public void main (String[] args) {
        launch(JavaFxApplication.class);
    }
}
