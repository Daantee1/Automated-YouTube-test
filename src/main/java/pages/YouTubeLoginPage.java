package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTubeLoginPage {

    private final WebDriver driver;

    @FindBy(id = "identifierId")
    WebElement inputEmail;
    @FindBy(name = "Passwd")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@class = 'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")
    WebElement buttonNext;

    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b' and .//span[@class='VfPpkd-vQzf8d' and text()='Dalej']]")
    WebElement buttonSubmitLogin;

    @FindBy(xpath = "//yt-formatted-string[@id='channel-title' and text()='Dante']") //Change the Text for your account name
    WebElement profileName;

    public YouTubeLoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void loginUser(String email, String password){
        inputEmail.sendKeys(email);
        buttonNext.click();
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5000));
        WebElement inputPasswordWait = wait.until(ExpectedConditions.elementToBeClickable(inputPassword));
        inputPassword.sendKeys(password);
        buttonSubmitLogin.click();
    }
    public void chooseAccount () throws InterruptedException {
        Thread.sleep(13000);
        profileName.click();
    }
}
