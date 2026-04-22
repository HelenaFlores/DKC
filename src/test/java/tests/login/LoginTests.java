package tests.login;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.HomePage;
import tests.TestBase;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class LoginTests extends TestBase {
    private HomePage homePage = new HomePage();

    @CsvFileSource(resources = "/test_data/authorizationWithAllFilledFieldsTest.csv")
    @Tag("smoke")
    @ParameterizedTest(name = "Авторизация с верно заполненнным логином {0} и паролем {1}")
    void succsessfulLoginTest(String login, String password) {
            homePage.openPage()
                    .clickLoginInButton()
                    .setEmail(login)
                    .setPassword(password)
                    .clickAuthButton();

            homePage.presenceOfAuthMenu();
    }

    @Tag("smoke")
    @Test
    void wrongPasswordForLoginTest() {
            homePage.openPage()
                    .clickLoginInButton()
                    .setEmail(login)
                    .setPassword(errorPassword)
                    .clickAuthButton();

           String actualThat = homePage.getTextAlert().toString();
           assertThat(actualThat).isEqualTo(errorText);
    }
}
