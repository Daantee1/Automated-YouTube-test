package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTubeSearchPage {

    private final WebDriver driver;

    @FindBy(xpath = "//input[@class='gsfi ytd-searchbox']")
    WebElement inputSearch;
    @FindBy(xpath="//button[@id='search-icon-legacy']")
    WebElement buttonSearch;
    @FindBy(xpath = "//a[@id='video-title' and contains(@title, 'Eagles - Hotel California (Live 1977) (Official Video) [HD]')]")
    WebElement searchVideo;

    public YouTubeSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchFor(String inputSearchText){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement inputSearchWait = wait.until(ExpectedConditions.elementToBeClickable(inputSearch));
        inputSearch.sendKeys(inputSearchText);
        buttonSearch.click();
        WebElement clickVideoWait = wait.until(ExpectedConditions.elementToBeClickable(searchVideo));
        searchVideo.click();
    }
}
