import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.YouTubeLoginPage;
import pages.YouTubeMainPage;
import pages.YouTubeResultPage;
import pages.YouTubeSearchPage;

public class TestSetup {

    WebDriver driver;
    String BASE_URL = "https://www.youtube.com/";

    YouTubeMainPage youtubeMainPage;
    YouTubeLoginPage youtubeLoginPage;
    YouTubeSearchPage youtubeSearchPage;
    YouTubeResultPage youtubeResultPage;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\programowanie\\Test_YouTube\\chromedriver.exe");

        // ChromeOptions to avoid detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        youtubeMainPage = PageFactory.initElements(driver, YouTubeMainPage.class);
        youtubeLoginPage = PageFactory.initElements(driver, YouTubeLoginPage.class);
        youtubeSearchPage = PageFactory.initElements(driver, YouTubeSearchPage.class);
        youtubeResultPage = PageFactory.initElements(driver, YouTubeResultPage.class);
        driver.get(BASE_URL);
    }

    @After
    public void teardown(){
        //driver.quit();
    }
}
