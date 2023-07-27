package tests;

import models.Contact;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContactTest extends BaseTest{
    @Test
    public void contactMustBeCreated(){
        //логин
        loginPage.open()
                .login("eadau-91gw@force.com", "Nata1111")
                .clickLoginButton();
        //открыть страницу контакта
        contactListPage.open()
                //кликнуть кнопку NEW
                .clickNewButton();
        Contact contact = new Contact("Ms.","Ivan","Ivanov","326457","2935357755",
                "TestName", "jhgfd","eadau-91gw@force.com","Chkalova","Vitebsk",
                "210022","kjhgfd","Belarus","Lenina","Kazan",
                "456322", "jhgfd","Russia","4355568","986652",
                "432234","455654532","xhigh","lkjhgvf","hgfdzs","Other","all fields are filled");
        contactModalPage.create(contact);

        assertEquals(contactDetailsPage.getFieldValue("AccountName"),contactDetailsPage.getAccountName(contact));
        assertEquals(contactDetailsPage.getFieldValue("Name"),contactDetailsPage.getName(contact));
        assertEquals(contactDetailsPage.getFieldValue("Phone"),contact.getPhone());
        assertEquals(contactDetailsPage.getFieldValue("Mobile"),contact.getMobile());
        assertEquals(contactDetailsPage.getFieldValue("Title"),contact.getTitle());
        assertEquals(contactDetailsPage.getFieldValue("Email"),contact.getEmail());
        assertEquals(contactDetailsPage.getFieldValue("Mailing Address"),contactDetailsPage.getMailingAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Other Address"),contactDetailsPage.getOtherAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Fax"),contact.getFax());
        assertEquals(contactDetailsPage.getFieldValue("HomePhone"),contact.getHomePhone());
        assertEquals(contactDetailsPage.getFieldValue("OtherPhone"),contact.getOtherPhone());
        assertEquals(contactDetailsPage.getFieldValue("AsstPhone"),contact.getAsstPhone());
        assertEquals(contactDetailsPage.getFieldValue("Assistant"),contact.getAssistant());
        assertEquals(contactDetailsPage.getFieldValue("Department"),contact.getDepartment());
        assertEquals(contactDetailsPage.getFieldValue("LeadSource"),contact.getLeadSource());
        assertEquals(contactDetailsPage.getFieldValue("Description"),contact.getDescription());

    }
}
