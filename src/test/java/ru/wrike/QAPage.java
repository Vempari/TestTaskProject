package ru.wrike;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class QAPage {
    private WebDriver driver;
    public QAPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTwitterLink() {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button"));
    }

    public WebElement getVeryInterested() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button"));
    }

    public WebElement getJustLooking() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[2]/button"));
    }

    public WebElement getOneFive() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button"));
    }

    public WebElement getSixFifteen() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[2]/button"));
    }

    public WebElement getSixteenTwentyFive() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[3]/button"));
    }

    public WebElement getTwentySixFifty() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[4]/button"));
    }

    public WebElement getFiftyPlus() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[5]/button"));
    }

    public WebElement getYes() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button"));
    }

    public WebElement getNo() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[2]/button"));
    }

}
