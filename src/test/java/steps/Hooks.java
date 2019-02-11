package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public static WebDriver myDriver;
        //static int x = 0;

        @Before
        public void beforeMethod() {
           // if(x==0) {
                System.setProperty("webdriver.chrome.driver", "C:\\Selenium Chrome driver\\chromedriver.exe");
               // x = 1;
           // }
            myDriver = new ChromeDriver();
            myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

        }

        @After
        public void afterMethod()
        {
            myDriver.quit();

        }
    }



