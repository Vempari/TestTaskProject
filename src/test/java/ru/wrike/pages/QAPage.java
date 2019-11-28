package ru.wrike.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class QAPage {
    private WebDriver driver;
    public QAPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement getTwitterLink(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a"));
    }

    public static WebElement getSubmitButton(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button"));
    }

    public static WebElement getVeryInterested(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button"));
    }

    public static WebElement getJustLooking(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[2]/button"));
    }

    public static WebElement getOneFive(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button"));
    }

    public static WebElement getSixFifteen(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[2]/button"));
    }

    public static WebElement getSixteenTwentyFive(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[3]/button"));
    }

    public static WebElement getTwentySixFifty(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[4]/button"));
    }

    public static WebElement getFiftyPlus(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[5]/button"));
    }

    public static WebElement getYes(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button"));
    }

    public static WebElement getNo(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[2]/button"));
    }

    public static WebElement getThanksDiv(WebDriver driver) {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div"));
    }

}