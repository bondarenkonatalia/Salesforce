package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithValidData() {
        boolean isHomePageOpen = loginPage.open()
                .login("eadau-91gw@force.com", "Nata1111")
                .clickLoginButton()
                .isPageOpen();

        assertTrue(isHomePageOpen);
    }
}
