package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private final SelenideElement loginInButton = $("a[href='#authorization']");
    private final SelenideElement emailInput = $("[name='USER_LOGIN']");
    private final SelenideElement passwordInput = $("[name='USER_PASSWORD']");
    private final SelenideElement authButton = $("[name='Login']");
    private final SelenideElement authzorizedProfileButton =
            $(".buttons-bottom-header__link.drop-menu.authorized-user._init");
    private final SelenideElement authMenu = $(".authorized-user__menu");
    private final SelenideElement logoutButton = $("a[href*='logout']");
    private final SelenideElement errorAlert = $(".error_request._opened");
    private final SelenideElement basketButton = $("a[href='/personal/cart/']");
    private final SelenideElement catalogButton = $("a[href='/catalog/']");

    @Step("Open form")
    public HomePage openPage() {
        open(baseUrl);

        return this;
    }

    @Step("Click button log in")
    public HomePage clickLoginInButton() {
        loginInButton.click();

        return this;
    }

    @Step("Type email \"{value}\"")
    public HomePage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    @Step("Type password \"{value}\"")
    public HomePage setPassword(String value) {
        passwordInput.setValue(value);

        return this;
    }

    @Step("Click button auth")
    public HomePage clickAuthButton() {
        authButton.click();

        return this;
    }

    @Step("Checking for authMenu")
    public HomePage presenceOfAuthMenu() {
        authMenu.shouldHave();

        return this;
    }

    @Step("Checking for authMenu is Disabled")
    public HomePage presenceOfAuthMenuIsMissing() {
        authMenu.shouldNotHave();

        return this;
    }

    @Step("Click logout button")
    public HomePage clickLogoutButton() {
        logoutButton.click();

        return this;
    }

    @Step("Click profile button")
    public HomePage clickProfileButton() {
        authzorizedProfileButton.click();

        return this;
    }

    @Step("Checking for text alert")
    public String getTextAlert() {
        errorAlert.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return errorAlert.getText();
    }

    @Step("Click basket button")
    public HomePage clickBasketButton() {
        basketButton.click();

        return this;
    }

    @Step("Click catalog button")
    public HomePage clickCatalogButton() {
        catalogButton.click();

        return this;
    }
}