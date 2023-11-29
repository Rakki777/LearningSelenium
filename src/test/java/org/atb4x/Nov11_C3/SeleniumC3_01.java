package org.atb4x.Nov11_C3;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumC3_01 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
    }

    @Owner("Rakshith")
    @Test
    public void TestBrowser() {
    driver.get("https://app.vwo.com");
    List<WebElement> button_list = driver.findElements(By.tagName("button"));
    System.out.println(button_list);

    for(WebElement button : button_list) {
        System.out.println(button.getText());
    }

//    WebElement linktext_starttrial = driver.findElement(By.linkText("Start a free trial"));
    WebElement Linktext_starttrial = driver.findElement(By.partialLinkText("Start a free"));
    Linktext_starttrial.click();

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
