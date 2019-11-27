package ru.wrike;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class QAPageLogic {
    private WebDriver driver;
    private QAPage page;

    public QAPageLogic(WebDriver driver) {
        this.driver = driver;
        page = new QAPage(driver);
    }

    public void chooseInterest(String choose) {
        if (choose.equals("interested")) page.getVeryInterested().click();
        else page.getJustLooking().click();
    }

    public void chooseTeamMembers(String choose) {
        if (choose.equals("1-5")) page.getOneFive().click();
        else if (choose.equals("6-15")) page.getSixFifteen().click();
        else if (choose.equals("16-25")) page.getSixteenTwentyFive().click();
        else if (choose.equals("26-50")) page.getTwentySixFifty().click();
        else page.getFiftyPlus().click();
    }

    public void chooseFollow(String choose) {
        if (choose.equals("yes")) page.getYes().click();
        else page.getNo().click();
    }

    public void pushSubmitButton() {
        page.getSubmitButton().submit();
    }

    public void goToTwitter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", page.getTwitterLink());
    }

    public void goToTwitterPage() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void goToQAPage() {
        MainPageLogic logic = new MainPageLogic(driver);
        logic.pushGreenButton();
        logic.fillEmailField("asdasdwpt@wriketask.qaa");
        logic.pushBlueSubmitButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
