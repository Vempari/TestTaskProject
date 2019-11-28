package ru.wrike.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    public static WebElement getGreenButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button"));
    }

    public static WebElement getEmailField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@class='wg-input modal-form-trial__input']"));
    }

    public static WebElement getBlueSubmitButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='wg-btn wg-btn--blue modal-form-trial__submit'][@type='submit']"));
    }

    public static WebElement getFormBlock(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id='modal-pro']"));
    }

    public static WebElement getTextBlock(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id='modal-pro']/form/label[1]/input//div[2]/text()[1]"));
    }
}
