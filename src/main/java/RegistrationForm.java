import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationForm {
    private WebDriver driver;
    @FindBy(xpath = ".//input[@name='firstname']")
    private WebElement etFirstName;
    @FindBy(xpath = ".//*[@name='lastname']")
    private WebElement etSurName;
    @FindBy(xpath = ".//*[@name='reg_email__']")
    private WebElement etMobileNumberOrEmailAddress;
    @FindBy(xpath = ".//*[@name='reg_passwd__']")
    private WebElement etNewPasswords;
    @FindBy(xpath = ".//select[@id='day']")
    private WebElement ddDayDataOfBirth;
    @FindBy(xpath = ".//select[@id='day']/option[2]")
    private WebElement ddDayDataOfBirthNumber;
    @FindBy(xpath = ".//*[@name='birthday_month']")
    private WebElement ddMonthDataOfBirth;
    @FindBy(xpath = ".//*[@id='month']/option[2]")
    private WebElement ddMonthDataOfBirthNumber;
    @FindBy(xpath = ".//*[@name='birthday_year']")
    private WebElement ddYearDataOfBirth;
    @FindBy(xpath = ".//*[@id='year']/option [25]")
    private WebElement ddYearDataOfBirthNumber;
    @FindBy(xpath = ".//*[@class='_8esa' and @value='1']")
    private WebElement rdFermaleGender;
    @FindBy(xpath = ".//*[@name='websubmit']")
    private WebElement btnSignUp;




    public void fillFirstName (String textFirstName){
        etFirstName.sendKeys(textFirstName);

    }
    public String getFirstName(){
        return etFirstName.getAttribute("value");
    }

    public void fillSurname (String textSurname){
        etSurName.sendKeys(textSurname);

    }
    public String getSurName(){
        return etSurName.getAttribute("value");
    }
    public void fillEtMobileNumberOrEmailAddress (String textEtMobileNumberOrEmailAddress){
        etMobileNumberOrEmailAddress.sendKeys(textEtMobileNumberOrEmailAddress);

    }

    public String getMobileNumberOrEmailAddress (){
        return etMobileNumberOrEmailAddress.getAttribute("value");
    }

    public void fillEtNewPasswords (String textEtNewPasswords){
        etNewPasswords.sendKeys(textEtNewPasswords);
        etNewPasswords.submit();
    }
    public String getNewPasswords (){
        return etNewPasswords.getAttribute("value");
    }
    public void fillDayDataOfBirth (){
        ddDayDataOfBirth.click();
        ddDayDataOfBirthNumber.click();
    }
    public String getDayDataOfBirthNumber (){
        return ddDayDataOfBirthNumber.getAttribute("value");
    }

    public void fillMonthDataOfBirth (){
        ddMonthDataOfBirth.click();
        ddMonthDataOfBirthNumber.click();
    }
    public String getMonthDataOfBirthNumber (){
        return ddMonthDataOfBirthNumber.getAttribute("value");
    }
    public void fillYearDataOfBirth (){
        ddYearDataOfBirth.click();
        ddYearDataOfBirthNumber.click();
    }
    public String getYearDataOfBirthNumber(){
        return ddYearDataOfBirthNumber.getAttribute("value");
    }

    public void fillRdFermaleGender (){
        rdFermaleGender.click();

    }
    public String getFermaleGender(){
        return rdFermaleGender.getAttribute("value");
    }
    public boolean getBtnSignUp(){
        return btnSignUp.isDisplayed();
    }
    public RegistrationForm (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



}
