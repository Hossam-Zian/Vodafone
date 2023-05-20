package org.example.StepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static java.lang.System.getProperty;


public class hooks

{

    public static WebDriver driver;
    public  static SoftAssert soft;
    public static WebDriverWait wait ;
    public static Actions act ;

@Before
    public void before()
    {
        Properties prop = System.getProperties();
        try {
            prop.load(new FileInputStream("src\\test\\resources\\config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(getProperty("browser").equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (getProperty("browser").equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver =new EdgeDriver();
        }
        else if (getProperty("browser").equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(getProperty("URL"));
        driver.manage().window().maximize(); act = new Actions(driver);
        soft =new SoftAssert();
        wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        
    }
@After
    public void after()
    {
     driver.quit();
    }
}