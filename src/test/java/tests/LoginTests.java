package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.HomePage;

import static io.qameta.allure.Allure.step;


public class LoginTests extends TestBase {
    private HomePage homePage = new HomePage();

    @BeforeEach
    void setUp() {
        step("Open form", () -> {
            homePage.openPage();
        });
    }

    @CsvFileSource(resources = "/test_data/authorizationWithAllFilledFieldsTest.csv")
    @Tag("positive")
    @Tag("baseTest")
    @ParameterizedTest(name = "Авторизация с верно заполненнным логином {0} и паролем {1}")
    void succsessfulLoginTest(String login, String password) {
        step("Fill form", () -> {
            homePage
                    .clickLoginInButton()
                    .setEmail(login)
                    .setPassword(password)
                    .clickAuthButton();
        });
        step("Verify results", () -> {
            homePage.presenceOfAuthMenu();
        });
    }

    @Tag("negative")
    @Test
    void practicFormWithoutFieldsTest() {
        step("Confirm the form without filling it out", () -> {
          //  homePage.submitClick();
        });
        step("Verify results", () -> {
           // homePage.presenceOfModalWindow();
            });
    }
}
