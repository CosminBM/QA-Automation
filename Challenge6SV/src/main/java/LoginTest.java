import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {

   private ChromeDriver driverChrome;
   private FirefoxDriver driverFirefox;
   private String testURL = "http://automationpractice.com/index.php";
   private String driverPathChrome = "./src/main/resources/chromedriver.exe";
   private String driverPathFirefox = "./src/main/resources/geckodriver.exe";
   private String validEmail = "cosmincoco88@gmail.com";
   private String validPassword = "test123";

    @BeforeClass
    public void openURLChrome(){
        //Load the URL in the webpage
        System.setProperty("webdriver.chrome.driver", driverPathChrome);
        driverChrome = new ChromeDriver();
        driverChrome.get(testURL);
        driverChrome.manage().window().maximize();
        //Check the loaded webpage
        String expectedHomePage = "http://automationpractice.com/index.php";
        String actualHomePage = driverChrome.getCurrentUrl();
        Assert.assertEquals(expectedHomePage, actualHomePage);
        //Click on the Sign in button
        WebElement signInButtonChrome = driverChrome.findElement(By.className("login"));
        signInButtonChrome.click();
        //Check the login page
        String expectedLoginPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        String actualLoginPage = driverChrome.getCurrentUrl();
        Assert.assertEquals(expectedLoginPage, actualLoginPage);
    }

    @Test(priority = 3)
    public void testValidLoginChrome(){
        //Input email
        WebElement inputEmail = driverChrome.findElement(By.cssSelector("#email"));
        inputEmail.clear();
        inputEmail.sendKeys(validEmail);
        //Check the email
        Assert.assertEquals(validEmail, inputEmail.getAttribute("value"));
        //Input password
        WebElement inputPassword = driverChrome.findElement(By.cssSelector("#passwd"));
        inputPassword.clear();
        inputPassword.sendKeys(validPassword);
        //Check the password
        Assert.assertEquals(validPassword, inputPassword.getAttribute("value"));
        //Click on the login button
        WebElement submitLogin = driverChrome.findElement(By.cssSelector("#SubmitLogin"));
        submitLogin.click();
        //Check the user page
        String expectedUserPage = "http://automationpractice.com/index.php?controller=my-account";
        String actualUserPage = driverChrome.getCurrentUrl();
        Assert.assertEquals(expectedUserPage,actualUserPage);
        //Check the user name
        String expectedUserName = "Cosmin Cosmin";
        WebElement actualUserName = driverChrome.findElement(By.xpath("//span[contains(text(),'Cosmin Cosmin')]"));
        Assert.assertEquals(expectedUserName,actualUserName.getText());
    }

    @Test(priority = 2)
    public void testInvalidPasswordChrome(){
        String invalidPassword = "test1234";
        //Input email
        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys(validEmail);
        //Check the email
        Assert.assertEquals(validEmail, inputEmail.getAttribute("value"));
        //Input password
        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys(invalidPassword);
        //Check the invalid password
        Assert.assertNotSame(validPassword, invalidPassword);
        //Click on the login button
        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();
        //Check the error message
        WebElement authMessage = driverChrome.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"));
        Assert.assertTrue(authMessage.isDisplayed());
    }

    @Test(priority = 1)
    public void testInvalidEmailChrome(){
        String invalidEmail = "cosmincoco886@gmail.com";
        //Input email
        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys(invalidEmail);
        //Check the invalid email
        Assert.assertNotSame(validEmail, invalidEmail);
        //Input password
        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys(validPassword);
        //Check the password
        Assert.assertEquals(validPassword,inputPassword.getAttribute("value"));
        //Click on the login button
        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();
        //Check the error message
        WebElement authMessage = driverChrome.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"));
        Assert.assertTrue(authMessage.isDisplayed());
    }

    @AfterClass
    public void closeWebPageChrome(){
        driverChrome.quit();
        System.out.println("Quit Chrome");
    }

    @BeforeClass
    public void openURLFirefox(){
        //Load the URL in the webpage
        System.setProperty("webdriver.gecko.driver", driverPathFirefox);
        driverFirefox = new FirefoxDriver();
        driverFirefox.get(testURL);
        driverFirefox.manage().window().maximize();
        //Check the loaded webpage
        String expectedHomePage = "http://automationpractice.com/index.php";
        String actualHomePage = driverFirefox.getCurrentUrl();
        Assert.assertEquals(expectedHomePage, actualHomePage);
        //Click on the Sign in button
        WebElement signInButtonChrome = driverFirefox.findElement(By.className("login"));
        signInButtonChrome.click();
        //Check the login page
        String expectedLoginPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        String actualLoginPage = driverFirefox.getCurrentUrl();
        Assert.assertEquals(expectedLoginPage, actualLoginPage);
    }

    @Test(priority = 3)
    public void testValidLoginFirefox(){
        //Input email
        WebElement inputEmail = driverFirefox.findElement(By.cssSelector("#email"));
        inputEmail.clear();
        inputEmail.sendKeys(validEmail);
        //Check the email
        Assert.assertEquals(validEmail, inputEmail.getAttribute("value"));
        //Input password
        WebElement inputPassword = driverFirefox.findElement(By.cssSelector("#passwd"));
        inputPassword.clear();
        inputPassword.sendKeys(validPassword);
        //Check the password
        Assert.assertEquals(validPassword, inputPassword.getAttribute("value"));
        //Click on the login button
        WebElement submitLogin = driverFirefox.findElement(By.cssSelector("#SubmitLogin"));
        submitLogin.click();
        //Check the user page
        String expectedUserPage = "http://automationpractice.com/index.php?controller=my-account";
        String actualUserPage = driverFirefox.getCurrentUrl();
        Assert.assertEquals(expectedUserPage,actualUserPage);
        //Check the user name
        String expectedUserName = "Cosmin Cosmin";
        WebElement actualUserName = driverFirefox.findElement(By.xpath("//span[contains(text(),'Cosmin Cosmin')]"));
        Assert.assertEquals(expectedUserName,actualUserName.getText());
    }

    @AfterClass
    public void closeWebPageFirefox(){
        driverFirefox.quit();
        System.out.println("Quit Firefox");
    }
}
