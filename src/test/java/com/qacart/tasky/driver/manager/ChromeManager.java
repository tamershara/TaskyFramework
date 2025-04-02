package com.qacart.tasky.driver.manager;

import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {
    private ChromeManager() {}

    public static ChromeDriver getChromeDriver() {
        return new ChromeDriver();
    }
}
