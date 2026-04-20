package tests.catalog;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CatalogPage;
import pages.HomePage;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.headerCatalogText;

public class CatalogTests extends TestBase {

        private HomePage homePage = new HomePage();
        private CatalogPage catalogPage = new CatalogPage();

        @Tag("baseTest")
        @Test
        void succsessfulGoToCatalogTest() {
            step("Open form", () -> {
                homePage.openPage();
            });
            step("Fill form", () -> {
                homePage.clickCatalogButton();
            });
            step("Verify results", () -> {
                String actualThat = catalogPage.getTextHeader().toString();
                assertThat(actualThat).isEqualTo(headerCatalogText);
            });
    }
}
