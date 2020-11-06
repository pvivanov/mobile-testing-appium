package ru.testing.mobile.settings;

import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Component;

@Component
public class AndroidDriverConfigurator {
    private static final String myApp = "src/test/resources/yourApp.apk"; //TODO enter you app name

    @SneakyThrows
    public DesiredCapabilities androidCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, myApp);
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        return capabilities;
    }
}
