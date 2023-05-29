package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;
/**
 * Класс преднозначен для контроля регистрации пользователя
 * @author bli34
 * @version 1.0
 */
public class SignInController {
    /**
     * SignInPane открывает панель для регистрации
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Pane SignInPane;
    /**
     * RegistationLink создаёт ссылку для перехода к странице регистрации
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Hyperlink RegistationLink;
    /**
     * SignINLogin регистрирует логин нового пользователя
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label SignINLogin;
    /**
     * SignINPassword регистрирует пароль нового пользователя
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label SignINPassword;
    /**
     * loginField открывает поле для регистрации логина
     * @author bli34
     * @version 1.0
     */
    @FXML
    private TextField loginField;
    /**
     * passwordField открывает поле для регистрации пароля
     * @author bli34
     * @version 1.0
     */
    @FXML
    private TextField passwordField;
    /**
     * SignINButton кнопка для активации регистрации
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Button SignINButton;
    /**
     * incorrectLogin выдаёт ошибку, связанную с некоректностью введенного логина
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label incorrectLogin;
    /**
     * incorrectPassword выдаёт ошибку, связанную с некоректностью введенного пароля
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label incorrectPassword;
    /**
     * banText пресекает непристойные написанные выражения
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Label banText;
    //сделать его скрытым по умолчанию есть метод secretQuestionField.setVisible(false);
    /**
     * secretQuestionField выдаёт секретный вопрос при выполнении всех необходимых условий
     * @author bli34
     * @version 1.0
     */
    @FXML
    private TextField secretQuestionField;



    @FXML
    /**
     * onRegistrationLinkClick переводит в окно регистрации или выдаёт ошибку
     * @author bli34
     * @version 1.0
     */
    void onRegistrationLinkClick(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SignUp.fxml"));// Для Влада
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
    /**
     * onSigINButtonClick позволяет нажать на кнопку регистрации при правильности введенных данных
     * @throws SQLException выдыет в случае ошибки метода onSigINButtonClick(ActionEvent event)
     * @throws ClassNotFoundException выдыет в случае ошибки метода onSigINButtonClick(ActionEvent event)
     * @author bli34
     * @version 1.0
     */
    @FXML
    void onSigINButtonClick(ActionEvent event) throws SQLException, ClassNotFoundException {
        UserData user = new UserData();
        DataBaseHandle dataBase = new DataBaseHandle();
        user.setLogin(String.valueOf(loginField.getText()));
        user.setPassword(String.valueOf(passwordField.getText()));
        dataBase.getLoginArray();
        if(HelloApplication.passwordInputEfforts == 5 ){
            //нужно подключить ввод секретного слова в этом же месте или в другом окне

        }
        if(dataBase.getLoginArray().contains(user.getLogin()) && dataBase.getPasswordArray().contains(user.getPassword())){
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(HelloApplication.class.getResource("Proga.fxml"));
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
                  else if(!dataBase.getLoginArray().contains(user.getLogin())){
                           incorrectLogin.setText("Неверный логин");

                          }

        // метод неправильно введенного несколько раз пароля
        else if(!dataBase.getPasswordArray().contains(user.getPassword())){
            boolean check = false;
            passwordField.setText(null);
            incorrectPassword.setText("Неверный пароль");
            HelloApplication.passwordInputEfforts ++;
        }

    }

}