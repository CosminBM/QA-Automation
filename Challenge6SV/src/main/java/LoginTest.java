import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {

   public ChromeDriver driverChrome;

    @BeforeClass
    public void openURL(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("http://automationpractice.com/index.php");
        driverChrome.manage().window().maximize();
        WebElement signInButtonChrome = driverChrome.findElement(By.className("login"));
        signInButtonChrome.click();
        System.out.println("Open the login URL before test");
    }

    @Test(priority = 3)
    public void testValidLogin(){
        System.out.println("Test valid Login");
        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys("cosmincoco88@gmail.com");
        Assert.assertEquals("cosmincoco88@gmail.com","cosmincoco88@gmail.com");

        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys("test123");
        Assert.assertEquals("test123", "test123");

        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        WebElement userName = driverChrome.findElement(By.xpath("//span[contains(text(),'Cosmin Cosmin')]"));
        Assert.assertEquals(userName.getText(),"Cosmin Cosmin");
    }

    @Test(priority = 1)
    public void testInvalidPassword(){
        System.out.println("Test invalid Password");
        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys("cosmincoco88@gmail.com");
        Assert.assertEquals("cosmincoco88@gmail.com","cosmincoco88@gmail.com");

        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys("test1234");
        Assert.assertEquals("test1234", "test1234");

        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();
    }

    @Test(priority = 2)
    public void testInvalidEmail(){
        System.out.println("Test invalid Email");
        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys("cosmincoco886@gmail.com");
        Assert.assertEquals("cosmincoco886@gmail.com","cosmincoco886@gmail.com");

        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys("test123");
        Assert.assertEquals("test123", "test123");

        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();
    }

    @AfterClass
    public void closeWebPage(){
        driverChrome.quit();
        System.out.println("Quit Chrome");
    }
}
