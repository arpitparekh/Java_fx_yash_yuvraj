package com.arpit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Pane  // blank canvas
        Button b = new Button("Click me");

        b.setOnAction((ActionEvent t) -> {
            System.out.println("Hello");
        });

        // Layouts
        StackPane pane = new StackPane(b);
        // Scene
        Scene scene = new Scene(pane, 700, 300);

        // stage will render the scene object
        primaryStage.setTitle("This is My First JavaFx Application");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}
