import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Work\\QA-Automation-Java\\Challenge5SV\\chromedriver\\chromedriver.exe");

        ChromeDriver testLogin = new ChromeDriver();

        testLogin.get("http://automationpractice.com/index.php");
        testLogin.manage().window().maximize();

        WebElement SignInButton = testLogin.findElement(By.className("login"));
        SignInButton.click();

        WebElement InputEmail = testLogin.findElement(By.id("email"));
        InputEmail.sendKeys("cosmincoco88@gmail.com");

        WebElement InputPassword = testLogin.findElement(By.id("passwd"));
        InputPassword.sendKeys("test123");

        WebElement SubmitLogin = testLogin.findElement(By.id("SubmitLogin"));
        SubmitLogin.click();

       testLogin.quit();
    }
}
