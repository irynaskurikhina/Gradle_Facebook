import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Set up");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openFacebookForm() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        driver.get("https://sv-se.facebook.com/");
        Thread.sleep(5_000);
        System.out.println("I'm a facebook test");

        FirstPage page = new FirstPage(driver);
        page.clickAccept();
        Thread.sleep(4000);
        page.clickBtnOpenRegistrationForm();
        Thread.sleep(4000);


    }
   @Test (dependsOnMethods = {"openFacebookForm"})
    public void fillFacebookForm() throws InterruptedException {

        RegistrationForm form = new RegistrationForm(driver);

        form.fillFirstName("Iryna");
        Assert.assertEquals(form.getFirstName(), "Iryna");

        form.fillSurname("Skurikhina");
        Assert.assertEquals(form.getSurName(), "Skurikhina");

        form.fillEtMobileNumberOrEmailAddress("380930643558");
        Assert.assertEquals(form.getMobileNumberOrEmailAddress(), "380930643558");

        form.fillEtNewPasswords("test1234");
        Assert.assertEquals(form.getNewPasswords(), "test1234");

        form.fillDayDataOfBirth();
        Assert.assertEquals(form.getDayDataOfBirthNumber(), "2");

        form.fillMonthDataOfBirth();
        Assert.assertEquals(form.getMonthDataOfBirthNumber(), "2");

        form.fillYearDataOfBirth();
        Assert.assertEquals(form.getYearDataOfBirthNumber(), "1998");

        form.fillRdFermaleGender();
        Assert.assertEquals(form.getFermaleGender(), "1");

   }



    @Test (dependsOnMethods = {"fillFacebookForm"})
    public void checkButton() throws InterruptedException {
        System.out.println("Work");
       RegistrationForm form = new RegistrationForm(driver);

       Assert.assertTrue(form.getBtnSignUp());


    }

    @AfterTest
    public void shutDown() {
        driver.quit();
    }


}


