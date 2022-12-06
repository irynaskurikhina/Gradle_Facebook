import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {
    private WebDriver driver;
    @FindBy(xpath = ".//*[@data-cookiebanner='accept_button']")
    private WebElement btnAccept;
    @FindBy(xpath = ".//*[@data-testid='open-registration-form-button']")
    private WebElement btnOpenRegistrationForm;


    public void clickAccept(){
        btnAccept.click();
    }
    public void clickBtnOpenRegistrationForm(){
        btnOpenRegistrationForm.click();
    }
    public FirstPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}

