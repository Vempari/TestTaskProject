package ru.wrike.logic;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ru.wrike.pages.MainPage;

public class MainPageLogic {

    @Step
    public static void pushGreenButton(WebDriver driver) {
        MainPage.getGreenButton(driver).submit();
        Assert.assertFalse(MainPage.getFormBlock(driver).isDisplayed());
    }
    @Step
    public static void fillEmailField(String text, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", MainPage.getEmailField(driver));
        Assert.assertTrue(true);
    }
    @Step
    public static void pushBlueSubmitButton(WebDriver driver) {
        MainPage.getBlueSubmitButton(driver).submit();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("https://www.wrike.com/resend/", driver.getCurrentUrl());
    }
}
