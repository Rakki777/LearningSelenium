package org.atb4x.C1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium02 {
    public static void main(String[] args) {
        //Search Context -> Its Interface -> has 'findElement and FindElements' -> GGF
        //WebDriver -> Its a Interface -> has incomplete functions -> GF
        //RemoteWebDriver -> Class -> has some functions -> F
        //ChromeDriver, EdgeDriver, FirfoxDriver, SafariDriver, ... -> Son

        //GGF reference -------- son object
//        SearchContext driver = new ChromeDriver();
//        driver.findElement();
//        driver.findElement();
//        only available 2 functions
        //GF reference ------------ son object
//        WebDriver driver = new ChromeDriver();
//        driver.//available more functons
        // F reference ---------- son object
//        RemoteWebDriver driver = new ChromeDriver();
//        driver.//available more functions
        // Son reference ------- son object
//        ChromeDriver driver = new ChromeDriver(); - all chrome functions
//        EdgeDriver driver = new EdgeDriver();
//        driver.//available all functions

//        Your Automation run only on Chrome ?
//        use - ChromeDriver driver = new ChromeDriver()
//        Change to Edge Driver ?
//        Use - driver = new EdgeDriver();

//        Your Automtion run on any WebBrowsers
//        Use - RemoteWebDriver driver (with Grid Setup)
    }
}
