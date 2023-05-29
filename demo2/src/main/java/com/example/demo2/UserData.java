package com.example.demo2;

import java.util.regex.*;
/**
 * Класс, содержащий методы для дальнейшей работы и обращения к данным пользователей
 * HelloApplication является родителем класса DataBaseHandle
 * @author bli34
 * @version 1.0
 */
public class UserData {
    /**
     * @param login введенный логин
     * @author bli34
     * @version 1.0
     */
    private String login;
    /**
     * @param password введенный пароль
     * @author bli34
     * @version 1.0
     */
    private String password;
    /**
     * @param name введенное имя
     * @author bli34
     * @version 1.0
     */
    private String name;
    /**
     * @param surname введенная фамилия
     * @author bli34
     * @version 1.0
     */
    private String surname;
    /**
     * @param fatherName введенное отчество
     * @author bli34
     * @version 1.0
     */
    private String fatherName;
    /**
     * @param birthDate введенная дата рождения
     * @author bli34
     * @version 1.0
     */
    private String birthDate;
    /**
     * @param group введенная группа факультета
     * @author bli34
     * @version 1.0
     */
    private String group;
    /**
     * @param secretQuestion выданный секретный вопрос
     * @author bli34
     * @version 1.0
     */
    private String secretQuestion;
    /**
     * @param email введенный почтовый адрес
     * @author bli34
     * @version 1.0
     */
    private String email;
    /**
     * @param phoneNumber введенный номер телефона
     * @author bli34
     * @version 1.0
     */
    private String phoneNumber;
    //Нужно сделать регулярки для каждого метода Set
    /**
     * setLogin регистрирует логин, введенный пользователем,в базу данных пользователей
     * @return возвращает логин пользователя
     * @author bli34
     * @version 1.0
     */
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;}
    /**
     * setPassword регистрирует пароль, введенный пользователем,в базу данных пользователей
     * @return возвращает пароль пользователя
     * @author bli34
     * @version 1.0
     */
    public void setPassword(String password){//Нужно зациклить ввод пароля, пока он не надежен вводится новый
       /*String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_).{8,20}$";
        Pattern CheckThePassword = Pattern.compile(passwordPattern);
        Matcher m = CheckThePassword.matcher(password);
        if(m.matches() == true) {
*/
            this.password = password;
       /* }
        else{
            System.out.println("Введите пароль надежнее!");
        }*/
    }
    /**
     * @param getPassword() выдает пароль
     * @return возвращает значение пароля
     * @author bli34
     * @version 1.0
     */
    public String getPassword(){
        return password;
    }
    /**
     * setName присваивает значение имени пользователя
     * @author bli34
     * @version 1.0
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * @param getPassword() выдает пароль
     * @return возвращает значение пароля
     * @author bli34
     * @version 1.0
     */
    public String getName(){
        return name;
    }
    /**
     * setSurname присваивает значение фамилии пользователя
     * @author bli34
     * @version 1.0
     */
    public void setSurname(String surname){
        this.surname = surname;
    }
    /**
     * @param getSurname() выдает фамилию
     * @return возвращает значение фамилии
     * @author bli34
     * @version 1.0
     */
    public String getSurname(){
        return surname;
    }
    /**
     * setFatherName присваивает значение отчеству пользователя
     * @author bli34
     * @version 1.0
     */
    public void setFatherName(String fatherName){
        this.fatherName = fatherName;
    }
    /**
     * @param getFatherName() выдает отчество
     * @return возвращает значение отчестства
     * @author bli34
     * @version 1.0
     */
    public String getFatherName(){
        return fatherName;
    }
    /**
     * setBirthDate присваивает значение дате рождения пользователя
     * @author bli34
     * @version 1.0
     */
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    /**
     * @param getBirthDate() выдает дату рождения
     * @return возвращает значение даты рождения
     * @author bli34
     * @version 1.0
     */
    public String getBirthDate(){
        return birthDate;
    }
    /**
     * setGroup присваивает значение группе факультета пользователя
     * @author bli34
     * @version 1.0
     */
    public void setGroup(String group){
        this.group = group;
    }
    /**
     * @param getGroup() выдает группу факультета
     * @return возвращает значение группы факультета
     * @author bli34
     * @version 1.0
     */
    public String getGroup(){
        return group;
    }
    /**
     * setSecretQuestion присваивает значение секретному воросу пользователя
     * @author bli34
     * @version 1.0
     */
    public void setSecretQuestion(String secretQuestion){
        this.secretQuestion = secretQuestion;
    }
    /**
     * @param getSecretQuestion() выдает секретный вопрос
     * @return возвращает значение секретного вопроса
     * @author bli34
     * @version 1.0
     */
    public String getSecretQuestion(){
        return secretQuestion;
    }
    /**
     * setEmail присваивает значение почтовому адресу пользователя
     * @author bli34
     * @version 1.0
     */
    public void setEmail(String email){
        this.email = email;
    }
    /**
     * @param getEmail() выдает почтовый адрес
     * @return возвращает значение почтового адреса
     * @author bli34
     * @version 1.0
     */
    public String getEmail(){
        return email;}
    /**
     * setPhoneNumber присваивает значение номеру телефона пользователя
     * @author bli34
     * @version 1.0
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /**
     * @param getPhoneNumber() выдает номер телефона
     * @return возвращает значение номера телефона
     * @author bli34
     * @version 1.0
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
}