package org.atb4x.Nov11_C3;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumC3_02 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
    }

    @Owner("Rakshith")
    @Test
    public void TestBrowser() {
    driver.get("https://app.vwo.com");






    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
