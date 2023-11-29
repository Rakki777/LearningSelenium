package org.atb4x.C2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumC2_02 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("http://sdet.live");
    }
}
