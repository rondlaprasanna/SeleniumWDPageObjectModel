/*
 * Copyright Ministry of Transport
 */
package flight.book.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author RidleySN
 */
public class TestRunningAPlainWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:/Development/Drivers/IEDriverServer.exe");
          WebDriver driver = new InternetExplorerDriver();
        //WebDriver driver = new FirefoxDriver();
         driver.get("http://www.google.com.au");
    }
}
