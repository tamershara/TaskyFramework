package com.qacart.tasky.driver.manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public final class FirefoxManager {
    private FirefoxManager() {}
    public static FirefoxDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }
}
