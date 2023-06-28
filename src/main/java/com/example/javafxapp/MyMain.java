package com.example.javafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MyMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        Pane rootNode = loader.load();
        Scene scene = new Scene(rootNode, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
