package org.atb4x.Nov11_C3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelelniumC3_awesomeqaXpath {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
    }
@Test
    public void testBrowser(){
        driver.get("https://awesomeqa.com/xpath/");
        WebElement vertibrets = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/child::div"));
        System.out.println(vertibrets.getText());
    }

}
