package org.atb4x.C2;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariOptions;

public class SeleniumC2_01 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-minimized");
        edgeOptions.addArguments("--incognito");
//        edgeOptions.setHeadless(true); not showing the setHEadless

        EdgeDriver driver = new EdgeDriver(edgeOptions); //Dynamic Dispatch - runtime polymorph
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
