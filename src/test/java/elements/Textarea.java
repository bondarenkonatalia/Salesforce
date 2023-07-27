package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textarea {
    String textareaLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//textarea | //label[text()='%s']/ancestor::div[contains(@class,'slds-form-element__row')]//textarea";
    String contactDescriptionTextareaLocator = "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid slds-size_1-of-1')]//textarea";

    WebDriver driver;
    String label;

    public Textarea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextareaLocator(String text) {
        driver.findElement(By.xpath(String.format(textareaLocator, this.label, this.label))).clear();
        driver.findElement(By.xpath(String.format(textareaLocator, this.label, this.label))).sendKeys(text);
    }

    public void writeContactDescriptionTextAreaLocator(String text) {
        driver.findElement(By.xpath(String.format(contactDescriptionTextareaLocator, this.label))).clear();
        driver.findElement(By.xpath(String.format(contactDescriptionTextareaLocator, this.label))).sendKeys(text);
    }
}
