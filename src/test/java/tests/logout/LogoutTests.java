package tests.logout;

import components.LoginUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static tests.TestData.login;
import static tests.TestData.password;

public class LogoutTests extends TestBase {
    private HomePage homePage = new HomePage();

    @BeforeEach
    void setUpTest() {
        step("Open form and login", () -> {
            LoginUI loginUI = new LoginUI();
            loginUI.login(login, password);
        });
    }

    @Test()
    void succsessfulLogoutTest() {
        step("Logout profile", () -> {
            homePage
                    .clickProfileButton()
                    .clickLogoutButton();
        });
        step("Verify results", () -> {
            homePage.presenceOfAuthMenuIsMissing();
        });
    }
}
