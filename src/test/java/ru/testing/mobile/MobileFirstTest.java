package ru.testing.mobile;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.testing.mobile.settings.AndroidDriverConfigurator;
import ru.testing.mobile.settings.AndroidDriverInitializer;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
@SpringBootTest(classes = Application.class)
public class MobileFirstTest {

    @Autowired
    public AndroidDriverConfigurator androidDriverConfigurator;

    @Autowired
    public AndroidDriverInitializer androidDriverInitializer;

    private AndroidDriver driver;

    @BeforeAll
    public void initializedDriverAndInstallApp(){
        driver = androidDriverInitializer.initializeAndroidDriver(androidDriverConfigurator.androidCapabilities());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Show me all elements on page")
    public void getAllElementsonPage (){
        System.out.println(driver.getPageSource());
    }
}