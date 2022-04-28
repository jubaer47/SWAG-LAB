package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class browserConfig {
   public WebDriver driver;
    public void initializeDriver() throws IOException {

        Properties pro =new Properties();
        FileInputStream fis =new FileInputStream("src/test/java/resources/data.properties");
        pro.load(fis);
        String browsername = pro.getProperty("browser");

        if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jubae\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        }
        else if(browsername.equals("firefox")){

        }
        else {
            System.out.println("Browser not avilable");
        }
        driver.get("https://www.saucedemo.com/");

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




    }


}
