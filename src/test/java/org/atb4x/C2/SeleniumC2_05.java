package org.atb4x.C2;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumC2_05 {

    EdgeDriver driver;
@BeforeTest
            public void openBrowser(){
    driver = new EdgeDriver();
    driver.get("https://app.vwo.com");

}
    @Owner("Rakshith")
    @Test
            public void negetiveTest(){
//Elements copied from html
//        <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

//        <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe" data-gtm-form-interact-field-id="0">

//        <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
//          <span class="icon loader hidden" data-qa="zuyezasugu"></span>
//          <span data-qa="ezazsuguuy">Sign in</span>
//          </button>

//        <div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

//        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized");



        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        //its not a good practice
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // we have to add thread.wait, as the error message will not show immidiate after click,
        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


    }

    }
