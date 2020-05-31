package com.maria.epam.lab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Human nik = new Human();
        Scene scene = new Scene(nik.getPane());
        stage.setScene(scene);
        stage.setTitle("Office");
        stage.show();
    }
}
