package org.example;

import org.openqa.selenium.By;

public class ResgistrationPage extends HomePage{

    By _firstName=By.name("FirstName");
    By _lastName=By.name("LastName");
    By _email =By.name("Email");
    By _password =By.name("Password");
    By _confirmPassword =By.name("ConfirmPassword");
    By _registerationButon=By.id("register-button");


    public void enterRegitrationDetails(){
        sendKeyText(_firstName,"Milan");
        sendKeyText(_lastName,"Vaghasiya");
        sendKeyText(_email,"Milan002+"+currentTime()+"@gmail.com");
        sendKeyText(_password,"Milan12345");
        sendKeyText(_confirmPassword,"Milan12345");

        clickFindElement(_registerationButon);
    }
}
