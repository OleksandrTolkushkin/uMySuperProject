package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage
{
    @FindBy(xpath="//p[@class='make_message']/a")
    private WebElement btnCreateEmail;

    @FindBy(xpath="//p[@span_class='link']/a[contains(@link,'/showAddressBook/')]")
    private WebElement inputTo;

    @FindBy(name="subject")
    private WebElement inputSubject;

    @FindBy(name="send")
    private WebElement btnSendEmail;

    public void setBtnCreateEmail(WebElement btnCreateEmail) {
        this.btnCreateEmail = btnCreateEmail;
    }

    void BtnSendEmail (String to, String subject) {

        btnCreateEmail.click();
        inputTo.sendKeys(to);
        inputSubject.sendKeys(subject);
        btnSendEmail.click();
    }
}
