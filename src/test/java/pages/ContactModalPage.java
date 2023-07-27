package pages;

import elements.DropDown;
import elements.Input;
import elements.Textarea;
import models.Account;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    public static final By NEW_CONTACT_TITLE = By.xpath("//div[contains(@class,'entityNameTitle')][text() = 'Contact']");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }
    public ContactDetailsPage create(Contact contact) {
        new DropDown(driver, "Salutation").selectOption(contact.getSalutation());
        new Input(driver, "FirstName").write(contact.getFirstName());
        new Input(driver, "LastName").write(contact.getLastName());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getLastName());
        new DropDown(driver, "AccountName").selectOption(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Textarea(driver, "MailingStreet").writeTextareaLocator(contact.getMailingStreet());
        new Input(driver, "MailingCity").write(contact.getMailingCity());
        new Input(driver, "MailingZip_PostalCode").write(contact.getMailingZip_PostalCode());
        new Input(driver, "MailingState_Province").write(contact.getMailingState_Province());
        new Input(driver, "MailingCountry").write(contact.getMailingCountry());
        new Textarea(driver, "OtherStreet").writeTextareaLocator(contact.getOtherStreet());
        new Input(driver, "OtherCity").write(contact.getLastName());
        new Input(driver, "OtherZip_PostalCode").write(contact.getLastName());
        new Input(driver, "OtherState_Province").write(contact.getLastName());
        new Input(driver, "OtherCountry").write(contact.getLastName());
        new Input(driver, "Fax").write(contact.getLastName());
        new Input(driver, "HomePhone").write(contact.getLastName());
        new Input(driver, "OtherPhone").write(contact.getLastName());
        new Input(driver, "AsstPhone").write(contact.getLastName());
        new Input(driver, "Assistant").write(contact.getLastName());
        new Input(driver, "Department").write(contact.getLastName());
        new DropDown(driver, "LeadSource").selectOption(contact.getLeadSource());
        new Textarea(driver, "Description").writeContactDescriptionTextAreaLocator(contact.getDescription());
        return clickSaveButton();
    }

    public ContactDetailsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(NEW_CONTACT_TITLE);
    }
}
