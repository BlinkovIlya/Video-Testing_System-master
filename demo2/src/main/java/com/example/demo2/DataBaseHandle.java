package com.example.demo2;
import java.sql.*;
import java.util.ArrayList;
/**
 * Класс, содержащий методы для дальнейшей работы и обращения к параметрам приложения
 * Configs является родителем класса DataBaseHandle
 * @author bli34
 * @version 1.0
 */
public class DataBaseHandle extends Configs {
    /**
     * dbConnection возвращает соеденеие с базой данных
     * @author bli34
     * @version 1.0
     */
    Connection dbConnection;
    /**
     * getDbConnection() даёт возможность подключится к серверу базы данных
     * @throws ClassNotFoundException выдает в случае ошибки метода getDbConnection()
     * @throws SQLException выдает в случае ошибки getDbConnection()
     * @return возвращает dbConnection в обоих случаях
     * @author bli34
     * @version 1.0
     */
    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
     String connectionString = "jdbc:mysql://" + dbHost + ":" +
             dbPort + "/" + dbName;
     Class.forName("com.mysql.cj.jdbc.Driver");
             dbConnection = DriverManager.getConnection(connectionString,
                    dbUser, dbPass);
     return dbConnection;
    }
    /**
     * @param name регестрирует ползователя в системе MySQL
     * в случае введения некорректных данных выводит ошибку
     * @author bli34
     * @version 1.0
     */
    public void SignUpUser(String name){ //включить остальные параметры пользователя
       String insert = //"INSERT INTO users(name)\n"+"VALUES(?)";
        "INSERT INTO" + " " + Const.USER_TABLE + "("
               + Const.USER_NAME + ")" + " " + "VALUES(?)"; //какая-то ошибка считывания и подключения
        try {
       PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, name); //проверить считает с нуля или 1
        //изменить метод для вставки фамилии, почты и тд по аналогии...

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * @param getLoginArray даёт возможность получить массив с логинами для MySQL
     * @throws SQLException выдает в случае ошибки метода getLoginArray()
     * @throws ClassNotFoundException выдает в случае ошибки метода getLoginArray()
     * @return возвращает loginsArray в обоих случаях
     * @author bli34
     * @version 1.0
     */
    //метод для получения массива с логинами(сделать так, чтобы он брал сразу только логины, а не все)
    public ArrayList<String> getLoginArray() throws SQLException, ClassNotFoundException {
        String insert = "SELECT * FROM " + Const.USER_TABLE;
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(insert);
        ArrayList<String> loginsArray = new ArrayList<>();
        while (resultSet.next()){
            loginsArray.add(resultSet.getString("login"));

        }
        return loginsArray;
    }
    /**
     * @param getPasswordArray даёт возможность получить массив с праолями для MySQL
     * @throws SQLException выдает в случае ошибки метода getPasswordArray()
     * @throws ClassNotFoundException выдает в случае ошибки метода getPasswordArray()
     * @return возвращает passwordsArray в обоих случаях
     * @author bli34
     * @version 1.0
     */
    public ArrayList<String> getPasswordArray() throws SQLException, ClassNotFoundException {
        String insert = "SELECT * FROM " + Const.USER_TABLE;
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(insert);
        ArrayList<String> passwordsArray = new ArrayList<>();
        while (resultSet.next()){
            passwordsArray.add(resultSet.getString("password"));

        }
        return passwordsArray;
    }
    /**
     * @param getSecretAnswer даёт возможность получить массив с ответами на секретный ввопрос для MySQL
     * @throws SQLException выдает в случае ошибки метода getSecretAnswer()
     * @throws ClassNotFoundException выдает в случае ошибки метода getSecretAnswer()
     * @return возвращает secretAnswerArray в обоих случаях
     * @author bli34
     * @version 1.0
     */
    public ArrayList<String> getSecretAnswer() throws SQLException, ClassNotFoundException {
        String insert = "SELECT * FROM " + Const.USER_TABLE;
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(insert);
        ArrayList<String> secretAnswerArray = new ArrayList<>();
        while (resultSet.next()){
            secretAnswerArray.add(resultSet.getString("secretQuestion"));
        }
        return secretAnswerArray;
    }

}
