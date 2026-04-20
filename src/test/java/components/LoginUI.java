package components;

import pages.HomePage;

import static io.qameta.allure.Allure.step;

public class LoginUI {
    HomePage homePage = new HomePage();

    public void login(String login, String password) {
        step("Open form", () -> {
            homePage.openPage();
        });
        step("Fill form", () -> {
            homePage
                    .openPage()
                    .clickLoginInButton()
                    .setEmail(login)
                    .setPassword(password)
                    .clickAuthButton();
        });
    }
}
