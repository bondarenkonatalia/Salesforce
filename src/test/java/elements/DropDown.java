package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    String dropDownLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInputSelect')]//div[@class='uiMenu'] | //label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//button[contains(@class,'slds-combobox__input')]";
    String optionLocator = "//div[contains(@class, 'visible')]//a[text() = '%s'] | //lightning-base-combobox-item[contains(@class, 'slds-media')]//span[text() = '%s']";

    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label,this.label,this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option,option,option))).click();
    }
}
