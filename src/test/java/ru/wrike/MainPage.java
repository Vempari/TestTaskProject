package ru.wrike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public WebElement getGreenButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@class='wg-input modal-form-trial__input']"));
    }

    public WebElement getBlueSubmitButton() {
        return driver.findElement(By.xpath("//button[@class='wg-btn wg-btn--blue modal-form-trial__submit'][@type='submit']"));
    }



    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
}
