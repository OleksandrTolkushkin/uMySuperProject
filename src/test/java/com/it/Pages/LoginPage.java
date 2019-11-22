package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.Subject;
import java.util.TooManyListenersException;

public class LoginPage extends BasePage {
	@FindBy(name="login")
	private WebElement inputLogin;

    @FindBy(name="pass")
    private WebElement inputPassword;

    @FindBy(xpath="//input[@tabindex='5']")
    private WebElement btnSubmit;

    public void login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        btnSubmit.click();

    }

}
