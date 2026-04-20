package tests.basket;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BasketPage;
import pages.HomePage;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class BasketTests extends TestBase {

        private HomePage homePage = new HomePage();
        private BasketPage basketPage = new BasketPage();

        @Tag("smoke")
        @Test
        void succsessfulGoToBasketTest() {
            step("Open form", () -> {
                homePage.openPage();
            });
            step("Fill form", () -> {
                homePage.clickBasketButton();
            });
            step("Verify results", () -> {
                String actualThat = basketPage.getTextHeader().toString();
                assertThat(actualThat).isEqualTo(headerBasketText);
            });
    }
}
