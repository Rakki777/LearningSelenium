package org.atb4x.C2;

import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumC2_03 {
    public static void main(String[] args) {


        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://sdet.live");
        System.out.println(edgeDriver.getTitle());
        System.out.println(edgeDriver.getCurrentUrl());
//        edgeDriver.close(); // close the current browser tab
        edgeDriver.quit();// close the entire browser
    }
}
