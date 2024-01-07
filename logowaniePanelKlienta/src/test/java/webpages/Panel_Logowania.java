package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Panel_Logowania {

    @FindBy(xpath = "//h2[@class='loginFirstHeader']")
    public WebElement coockies;// zgoda na pliki coockies
    @FindBy(xpath = "//button[2][@title='Akceptuję wszystkie']")
    public WebElement akceptuj_wszystkie;//przycisk aksceptuj wszyskie pliki coockies
    @FindBy(className = "login")
    public WebElement login; // pole logowania
    @FindBy(className = "password")
    public WebElement password; // pole hasło
    @FindBy(id = "__submit_PK_M0118")
    public WebElement zaloguj_sie; //przycisk zaloguj się
    @FindBy(xpath = "//h3[@class='loginSubheader']")
    public WebElement kod_jednorazowy;//weryfikacja użytkownika po zalogowaniu
    private final WebDriver driver;

    public Panel_Logowania(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void okno_coockies() {
        akceptuj_wszystkie.click();

    }
}
