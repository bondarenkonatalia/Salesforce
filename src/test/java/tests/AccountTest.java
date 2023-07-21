package tests;

import com.beust.ah.A;
import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest{
    @Test
    public void accountShouldBeCreated(){
        //логин
        loginPage.open()
                .login("eadau-91gw@force.com", "Nata1111")
                .clickLoginButton();
        //открыть страницу аккаунта
        accountListPage.open()
        //кликнуть кнопку NEW
                .clickNewButton();
                Account account = new Account("Name","www.onliner.by","Investor","Banking",
                        "3325436654","245465","10","11","TSP","jugful",
                        "7654","Belarus","Minsk","jhgfd","65432",
                        "Belarus","kjhgfds hgt bends","kjhgf","bends");

        //заполнить все поля

        //Нажать кнопку Save
                 accountModalPage.create(account);
        //Проверить создание
        assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        assertEquals(accountDetailsPage.getFieldValue("Industry"),account.getIndustry());
        assertEquals(accountDetailsPage.getFieldValue("Phone"),account.getPhone());
        assertEquals(accountDetailsPage.getFieldValue("Fax"),account.getFax());
        assertEquals(accountDetailsPage.getFieldValue("Employees"),account.getEmployees());
        assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue()+" 000 000 000 Br");
        assertEquals(accountDetailsPage.getFieldValue("Description"),account.getDescription());
        assertEquals(accountDetailsPage.getFieldValue("Billing Address"),accountDetailsPage.getBillingAddress(account));
        assertEquals(accountDetailsPage.getFieldValue("Shipping Address"),accountDetailsPage.getShippingAddress(account));
    }
}
