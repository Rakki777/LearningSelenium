package org.atb4x.Nov11_C3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
public class SeleniumC3_Flipcart {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser (){
        driver = new EdgeDriver();
    }

    @Test
    //Open Flipacrt and click on Login button
    public void testBrowser(){

        driver.get("https://www.flipkart.com/");

        WebElement Login = driver.findElement(By.xpath("//span[text()=\"Login\"]"));
        Login.click();
    }
}
