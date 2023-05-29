package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.IOException;

/**
 * Класс, содержащий методы для дальнейшей работы и обращения к приложению
 * Application является родителем класса DataBaseHandle
 * @author bli34
 * @version 1.0
 */
public class HelloApplication extends Application {
    /**
     * start устанавливает иконку приложения
     * @throws IOException выдает в случае ошибки метода start
     * @author bli34
     * @version 1.0
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        //Установка иконки приложения
        /*InputStream iconStream = getClass().getResourceAsStream("/icon.png");
          Image image = new Image(iconStream);
          primaryStage.getIcons().add(image);*/
    }
    /**
     * @param passwordInputEfforts устанавливает количество неправильно введенных паролей
     * @author bli34
     * @version 1.0
     */
    static int passwordInputEfforts = 0;
    /**
     * main(String[] args) запускает приложение и открывает файл hello-view.fxml
     * @author bli34
     * @version 1.0
     */
    public static void main(String[] args)  {
        launch();


    }
}