package tests.logout;

import components.LoginUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import tests.TestBase;

import static tests.TestData.login;
import static tests.TestData.password;

public class LogoutTests extends TestBase {
    private HomePage homePage = new HomePage();

    @BeforeEach
    void setUpTest() {
        LoginUI loginUI = new LoginUI();
        loginUI.login(login, password);
    }

    @Tag("smoke")
    @Test()
    void succsessfulLogoutTest() {
        homePage
                .clickProfileButton()
                .clickLogoutButton();

        homePage.presenceOfAuthMenuIsMissing();
    }
}
