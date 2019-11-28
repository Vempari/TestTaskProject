package ru.wrike.logic;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ru.wrike.pages.QAPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QAPageLogic {
    @Step
    public static void chooseInterest(String choose, WebDriver driver) {
        if (choose.equals("interested")) QAPage.getVeryInterested(driver).click();
        else QAPage.getJustLooking(driver).click();
    }
    @Step
    public static void chooseTeamMembers(String choose, WebDriver driver) {
        switch (choose) {
            case "1-5":
                QAPage.getOneFive(driver).click();
                assertTrue(QAPage.getOneFive(driver).isSelected());
                break;
            case "6-15":
                QAPage.getSixFifteen(driver).click();
                assertTrue(QAPage.getSixFifteen(driver).isSelected());
                break;
            case "16-25":
                QAPage.getSixteenTwentyFive(driver).click();
                assertTrue(QAPage.getSixteenTwentyFive(driver).isSelected());
                break;
            case "26-50":
                QAPage.getTwentySixFifty(driver).click();
                assertTrue(QAPage.getTwentySixFifty(driver).isSelected());
                break;
            case "50+":
                QAPage.getFiftyPlus(driver).click();
                assertTrue(QAPage.getFiftyPlus(driver).isSelected());
                break;
        }
    }
    @Step
    public static void chooseFollow(String choose, WebDriver driver) {
        switch (choose) {
            case "yes":
                QAPage.getYes(driver).submit();
                assertTrue(true);
                break;
            case "no":
                QAPage.getNo(driver).submit();
                assertTrue(true);
                break;
        }
    }
    @Step
    public static void pushSubmitButton(WebDriver driver) {
        QAPage.getSubmitButton(driver).submit();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(QAPage.getSubmitButton(driver).isDisplayed());
    }
    @Step
    public static void goToTwitter(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", QAPage.getTwitterLink(driver));
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }
    @Step
    public static void goToTwitterPage(WebDriver driver) {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        Assert.assertEquals("https://twitter.com/wrike", driver.getCurrentUrl());
    }
}
