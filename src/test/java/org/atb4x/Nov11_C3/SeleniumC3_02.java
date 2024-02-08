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
        driver.get("https://katalon-demo-cura.herokuapp.com/");

//        WebElement Make_Apt_Btn = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));

        //Absolute Xath(Not recomended)
//        WebElement Make_Apt_Btn = driver.findElement(By.xpath("/html/body/header/div/a"));
        //Use Contains in Xpath
//        WebElement Make_Apt_Btn = driver.findElement(By.xpath("//a[contains(@id,\"appointment\")]"));
        // Use  text() in xpath
        WebElement Make_Apt_Btn = driver.findElement(By.xpath(" //a[text()=\"Make Appointment\"]"));


        Make_Apt_Btn.click();



    }


//    @AfterTest
//    public void closeBrowser(){
//        driver.quit();
//    }
}
