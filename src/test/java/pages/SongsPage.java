package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class SongsPage extends BasePage{

    @FindBy(css = "#songsWrapper [class='song-item']:nth-child(1)")
    WebElement firstSong;

    @FindBy(css = "[class='songs']")
    WebElement allSongsPage;

    @FindBy(css = "span[class='pause']")
    WebElement pauseButton;



    public SongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public void playFirstSong() {
        actions.doubleClick(firstSong).perform();
    }

    public void openAllSongs() {
        allSongsPage.click();
        //driver.get(koelSongs);
    }

    public WebElement getPauseButton(){
        wait.until(ExpectedConditions.visibilityOf(pauseButton));
        return pauseButton;
    }
}
