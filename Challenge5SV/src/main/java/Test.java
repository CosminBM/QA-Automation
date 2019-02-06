import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //Home path Chrome
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\chromedriver\\chromedriver.exe");

        //Work path Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cosmin.badescu\\Desktop\\QA-Automation-Java\\Challenge5SV\\chromedriver\\chromedriver.exe");

        ChromeDriver driverChrome = new ChromeDriver();

        driverChrome.get("http://automationpractice.com/index.php");
        driverChrome.manage().window().maximize();

        WebElement SignInButtonChrome = driverChrome.findElement(By.className("login"));
        SignInButtonChrome.click();

        WebElement InputEmail = driverChrome.findElement(By.id("email"));
        InputEmail.sendKeys("cosmincoco88@gmail.com");

        WebElement InputPassword = driverChrome.findElement(By.id("passwd"));
        InputPassword.sendKeys("test123");

        WebElement SubmitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        SubmitLogin.click();

        driverChrome.quit();

        //Home path Firefox
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\geckodriver\\geckodriver.exe");

        //Work path Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\cosmin.badescu\\Desktop\\QA-Automation-Java\\Challenge5SV\\geckodriver\\geckodriver.exe");

        FirefoxDriver driverFirefox = new FirefoxDriver();

        driverFirefox.get("http://automationpractice.com/index.php");
        driverFirefox.manage().window().maximize();

        driverFirefox.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

        driverFirefox.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("cosmincoco88@gmail.com");

        driverFirefox.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test123");

        driverFirefox.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        driverFirefox.quit();

        //Home path Edge
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\edgedriver\\MicrosoftWebDriver.exe");
//
//        WebDriver driverEdge = new EdgeDriver();
//
//        driverEdge.get("http://automationpractice.com/index.php");
//        driverEdge.manage().window().maximize();
//
//        WebElement SignInButton = driverEdge.findElement(By.tagName("//*[@class='header_user_info']//*[title()='Log in to your customer account']"));
//        SignInButton.click();

        driverFirefox.get("https://addons-dev.allizom.org/en-US/firefox/");
        driverFirefox.manage().window().maximize();

        driverFirefox.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/a[2]")).click();

        driverFirefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driverFirefox.findElement(By.className("email")).sendKeys( "cbadescu@mozilla.com");

        driverFirefox.findElement(By.id("password")).sendKeys("Softvision88!");

        driverFirefox.findElement(By.id("submit-btn")).click();
    }
}
