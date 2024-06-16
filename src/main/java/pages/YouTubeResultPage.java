package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubeResultPage {
    @FindBy(xpath = "//div[@id='placeholder-area']")
    WebElement commentInput;
    @FindBy(xpath = "//div[@class='yt-spec-button-shape-next yt-spec-button-shape-next--filled yt-spec-button-shape-next--disabled yt-spec-button-shape-next--size-m']")
    WebElement buttonSend;
    public void enterComment(String comment)
    {
        commentInput.sendKeys(comment);
        buttonSend.click();
    }


}
