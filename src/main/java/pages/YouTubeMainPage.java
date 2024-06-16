package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubeMainPage {

    @FindBy(xpath = "//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--filled yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m']")
    WebElement buttonAlert;

    @FindBy(xpath = "//a[@class= 'yt-spec-button-shape-next yt-spec-button-shape-next--outline yt-spec-button-shape-next--call-to-action yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading']")
    WebElement buttonLogin;





    public void acceptAlert(){
        buttonAlert.click();
    }
    public void goToLogin(){
        buttonLogin.click();

    }
}
