package tests;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailsPage accountDetailsPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        driver.quit();
    }
}
