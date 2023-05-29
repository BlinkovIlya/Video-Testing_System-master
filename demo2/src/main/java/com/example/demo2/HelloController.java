package com.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
/**
 * Класс преднозначен для обращения к пользователю через интерфейс
 * @author bli34
 * @version 1.0
 */

public class HelloController {
    /**
     * welcomeText выдаёт приветственные фразы и текст
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label welcomeText;
    /**
     * onHelloButtonClick метод кнопки, который после ввода пароля позволяет либо зарегестрироваться, либо выдаёт ошибку
     * @author bli34
     * @version 1.0
     */
    @FXML
    protected void onHelloButtonClick() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SignIn.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}