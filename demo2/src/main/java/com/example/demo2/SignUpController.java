package com.example.demo2;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 * Класс, содержащий методы для дальнейшей работы и обращения к подптсанным пользователем соглашениям
 * HelloApplication является родителем класса DataBaseHandle
 * @author bli34
 * @version 1.0
 */
public class SignUpController extends HelloApplication { ;
    Scanner sc = new Scanner(System.in);
    /**
     * SignUpButton кнопка для подписания соглашения
     * @author bli34
     * @version 1.0
     */
    @FXML
    private Button SignUpButton;
    /**
     * NameField поле для ввода имени нового пользователя
     * @author bli34
     * @version 1.0
     */
    @FXML
    private TextField NameField;
    /**
     * InsertName позволяет ввести имя в базу данных MySQL
     * @author bli34
     * @version 1.0
     */
    @FXML
    void InsertName(ActionEvent event) {

    }
    /**
     * initialize инициализирует пользователя при повторном посещении
     * @author bli34
     * @version 1.0
     */
    @FXML
    void initialize(){
        DataBaseHandle dataBase = new DataBaseHandle();
        SignUpButton.setOnAction(event -> {
            dataBase.SignUpUser(NameField.getText());
        });
    }
    /**
     * Click действует в качестве программы убирающей все пробелы
     * @author bli34
     * @version 1.0
     */
    @FXML
    void Click(ActionEvent event) {



        //String nameText  = NameField.getText().trim(); трим метод, который убирает все пробелы
        //if(!nameText.equals("")){
          //  loginUser(nameText);
       // }
       // else{
         //   System.out.println("Error");
        //}
    }
    //private void loginUser(String nameText) {
    //}
}

