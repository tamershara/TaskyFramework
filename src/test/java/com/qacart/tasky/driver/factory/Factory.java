package com.qacart.tasky.driver.factory;

import com.qacart.tasky.driver.manager.ChromeManager;
import com.qacart.tasky.driver.manager.FirefoxManager;
import com.qacart.tasky.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.qacart.tasky.config.ConfigFactory.getConfig;

public final class Factory {
    public static final Map<BrowserType, Supplier<WebDriver>> DRIVER_MAP = new HashMap<>();
    static
    {
        DRIVER_MAP.put(BrowserType.CHROME, ChromeManager::getChromeDriver);
        DRIVER_MAP.put(BrowserType.FIREFOX, FirefoxManager::getFirefoxDriver);
    }
    private Factory() {} // here to prevent people to create an object from this class
    public static WebDriver initDriver() {
        return DRIVER_MAP.get(getConfig().browser()).get();
    }
}
