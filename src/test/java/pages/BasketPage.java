package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private final SelenideElement basketHeader = $(".cart-page__title.title");

    @Step("Checking for text header")
    public String getTextHeader() {
        return basketHeader.getText();
    }
}
