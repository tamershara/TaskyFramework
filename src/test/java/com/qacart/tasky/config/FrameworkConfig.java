package com.qacart.tasky.config;

import com.qacart.tasky.config.converter.StringToBrowserTypeConverter;
import com.qacart.tasky.enums.BrowserType;
import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:env",
        "system:properties",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("https://tasky-be.qacart.com/api")
    String url();

    @ConverterClass(StringToBrowserTypeConverter.class)
    @DefaultValue("CHROME")
    BrowserType browser();

}
