package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {

    private final SelenideElement catalogHeader = $(".catalog-lvl-one__title.page-title");

    @Step("Checking for text header")
    public String getTextHeader() {
        return catalogHeader.getText();
    }
}
