package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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

    @Tag("positive")
    @Test
    void succsessfulLoginTest() {
        step("Fill form", () -> {
            homePage
                    .clickLoginInButton()
                    .setEmail("6f596d6697@emailax.pro")
                    .setPassword("Password1@")
                    .clickAuthButton();
        });
    /*    step("Verify results", () -> {
            homePage.checkResultForm("Student Name");
        });*/
    }


    @Tag("negative")
    @Test
    void practicFormWithoutFieldsTest() {
        step("Confirm the form without filling it out", () -> {
            homePage.submitClick();
        });
        step("Verify results", () -> {
            homePage.presenceOfModalWindow();
            });
    }
}
