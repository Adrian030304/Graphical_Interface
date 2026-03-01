package org.InterfataGrafica;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.util.Arrays;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {

//        Label textComponent = new Label("Textul acesta este folosit pentru label ");
//        Button button = new Button("Button for a message");
//
//        BorderPane layout = new BorderPane();
//        layout.setTop(new Label("NORD"));
//        layout.setBottom(new Label("SOUTH"));
//        layout.setLeft(new Label("WEST"));
//        layout.setRight(new Label("EAST"));
//
//        FlowPane componentGroup = new FlowPane();
//        componentGroup.getChildren().add(textComponent);
//        componentGroup.getChildren().add(button);
//
////        layout.setCenter(componentGroup);
//
        BorderPane layout = new BorderPane();

        TextArea zonaText = new TextArea("");
        layout.setCenter(zonaText);

        Label charsResult = new Label("Letters: ");
        Label countResult = new Label("Words: ");
        Label longestString = new Label("The longest word is: ");

        HBox textComponents = new HBox();
        textComponents.setSpacing(10);
        textComponents.getChildren().addAll(charsResult, countResult, longestString);

        layout.setBottom(textComponents);

        zonaText.textProperty().addListener((change, oldValue, newValue) -> {
            String[] words = newValue.split(" ");
            int chars = newValue.length();
            int wordCount = words.length;
            String longest = Arrays.stream(words)
                            .sorted((s1, s2) -> s2.length() - s1.length())
                            .findFirst()
                            .get();
            charsResult.setText("Letters: " + chars);
            countResult.setText("Words: " + wordCount);
            longestString.setText("The longest word is: " + longest);
        });



        Scene scene = new Scene(layout);
        window.setScene(scene);

        window.setTitle("Editor text");
        window.show();
    }

    static public void main (String[] args) {
        launch(JavaFxApplication.class);
    }
}
