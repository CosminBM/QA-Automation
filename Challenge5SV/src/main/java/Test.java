import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test {
    public static void main(String[] args) {
        //Home path Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\chromedriver\\chromedriver.exe");

        //Work path Chrome
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\cosmin.badescu\\Desktop\\QA-Automation-Java\\Challenge5SV\\chromedriver\\chromedriver.exe");

        ChromeDriver testLoginChrome = new ChromeDriver();

        testLoginChrome.get("http://automationpractice.com/index.php");
        testLoginChrome.manage().window().maximize();

        WebElement SignInButtonChrome = testLoginChrome.findElement(By.className("login"));
        SignInButtonChrome.click();

        WebElement InputEmail = testLoginChrome.findElement(By.id("email"));
        InputEmail.sendKeys("cosmincoco88@gmail.com");

        WebElement InputPassword = testLoginChrome.findElement(By.id("passwd"));
        InputPassword.sendKeys("test123");

        WebElement SubmitLogin = testLoginChrome.findElement(By.id("SubmitLogin"));
        SubmitLogin.click();

        testLoginChrome.quit();

        //Home path Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\geckodriver\\geckodriver.exe");

        //Work path Firefox
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\cosmin.badescu\\Desktop\\QA-Automation-Java\\Challenge5SV\\geckodriver\\geckodriver.exe");

        FirefoxDriver testLoginFirefox = new FirefoxDriver();

        testLoginFirefox.get("http://automationpractice.com/index.php");
        testLoginFirefox.manage().window().maximize();

        testLoginFirefox.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

        testLoginFirefox.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("cosmincoco88@gmail.com");

        testLoginFirefox.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test123");

        testLoginFirefox.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        testLoginFirefox.quit();

        //Home path Edge
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\edgedriver\\MicrosoftWebDriver.exe");
//
//        WebDriver testLoginEdge = new EdgeDriver();
//
//        testLoginEdge.get("http://automationpractice.com/index.php");
//        testLoginEdge.manage().window().maximize();
//
//        WebElement SignInButtonEdge = testLoginEdge.findElement(By.tagName("//*[@class='header_user_info']//*[title()='Log in to your customer account']"));
//        SignInButtonEdge.click();
    }
}
