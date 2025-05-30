package ru.netology.Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.netology.Data.DataHelper;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    @FindBy(css = "[data-test-id=login] input")
    private static SelenideElement loginField;

    @FindBy(css = "[data-test-id=password] input")
    private static SelenideElement passwordField;

    @FindBy(css = "[data-test-id=action-login]")
    private static SelenideElement loginButton;

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return page(VerificationPage.class);
    }

}
