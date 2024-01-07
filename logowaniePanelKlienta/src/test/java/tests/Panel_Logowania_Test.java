package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webpages.Panel_Logowania;
import java.time.Duration;

public class Panel_Logowania_Test {

    private WebDriver driver;

    @Before

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dariu\\Downloads\\seler2\\logowaniePanelKlienta\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.nazwa.pl/panel/zaloguj-sie.html");
    }

    @Test
    public void logowanie_do_konta (){
        Panel_Logowania pl = new Panel_Logowania(driver);
        pl.okno_coockies();
            System.out.println("Pole login jest wyświetlone?:" + pl.login.isDisplayed());
            System.out.println("Pole login jest aktywne?:" + pl.login.isDisplayed());
            pl.login.sendKeys("dario86");
            System.out.println("Pole hasło jest widoczne?:" + pl.password.isDisplayed());
            System.out.println("Pole hasło jest aktywne?:" + pl.password.isEnabled());
            pl.password.sendKeys("Da12345!");
            pl.zaloguj_sie.click();
            Assert.assertTrue(pl.kod_jednorazowy.isDisplayed());
    }

    @After

    public void quit(){
        driver.quit();
    }

}
