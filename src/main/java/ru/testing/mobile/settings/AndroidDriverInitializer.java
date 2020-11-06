package ru.testing.mobile.settings;

import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class AndroidDriverInitializer {

    @SneakyThrows
    public AndroidDriver initializeAndroidDriver(DesiredCapabilities capabilities){
        return new AndroidDriver(new URL("http://0.0.0.0:4719/wd/hub"), capabilities);
    }
}
