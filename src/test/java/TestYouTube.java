import org.junit.Test;

public class TestYouTube extends TestSetup {

    @Test
    public void shouldRun() throws InterruptedException {
        youtubeMainPage.acceptAlert();
        youtubeMainPage.goToLogin();
        youtubeLoginPage.loginUser("******", "*******");
        youtubeLoginPage.chooseAccount();
        youtubeSearchPage.searchFor("Eagles - Hotel California (Live 1977) (Official Video) [HD]");
        youtubeResultPage.enterComment("Good music!");
    }
}
