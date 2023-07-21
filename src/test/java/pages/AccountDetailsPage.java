package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_LINK = By.id("detailTab__item");
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public String getBillingAddress(Account account) {
        return account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingState_Province() + " "
                + account.getBillingZip_PostalCode() + "\n" + account.getBillingCountry();
    }

    public String getShippingAddress(Account account) {
        return account.getShippingStreet() + "\n" + account.getShippingCity() + ", " + account.getShippingState_Province() + " "
                + account.getShippingZip_PostalCode() + "\n" + account.getShippingCountry();
    }

        @Override
        public boolean isPageOpen () {
            return isExist(DETAILS_LINK);
        }
    }
       /* t говорит:<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "
        http://testng.org/testng-1.0.dtd
        ">
<suite name="Regression Test" parallel="tests" thread-count="2">
<test name="test 1">
<classes>
<class name="tests.LoginTest" />
</classes>
</test> <!-- Test -->
<test name="test 2">
<classes>
<class name="tests.InventoryTest" />
</classes>
</test> <!-- Test -->
</suite> */