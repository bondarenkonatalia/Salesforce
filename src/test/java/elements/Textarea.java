package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textarea {
    String textareaLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";
    WebDriver driver;
    String label;

    public Textarea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).clear();
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);
    }
}
