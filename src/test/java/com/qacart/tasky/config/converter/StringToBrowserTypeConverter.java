package com.qacart.tasky.config.converter;

import com.qacart.tasky.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browser) {
        Map<String,BrowserType> browserTypeMap = Map.of(
                "CHROME",BrowserType.CHROME,
                "FIREFOX",BrowserType.FIREFOX
        );
        return browserTypeMap.getOrDefault(browser.toUpperCase(),BrowserType.CHROME);
    }
}
