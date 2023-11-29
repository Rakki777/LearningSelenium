package org.atb4x.C2;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumC2_04 {
    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://sdet.live");
        edgeDriver.navigate().to("https://app.vwo.com");
        edgeDriver.navigate().to(new URL("https://google.com"));
        edgeDriver.navigate().back();
        edgeDriver.navigate().forward();
        edgeDriver.navigate().refresh();
        edgeDriver.quit();
    }
}
