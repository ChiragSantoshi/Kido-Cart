package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class DriverFactory {
    private static ThreadLocal<WebDriver> tl =  new ThreadLocal<>();

    public static WebDriver getDriver() {
        return tl.get();
    }
    //throws MalformedURLException
    public void setDriver(String browser) throws MalformedURLException {
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("credentials_enable_service", false);
//        prefs.put("profile.password_manager_leak_detection", false);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);
//        if (browser.equalsIgnoreCase("chrome")) {
//            tl.set(new ChromeDriver(options));
//        } else if (browser.equalsIgnoreCase("safari")) {
//            tl.set(new SafariDriver());
//        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName", "chrome");
        desiredCapabilities.setCapability("platformName", "Windows 11");
        tl.set(new RemoteWebDriver(new URL("http://192.168.0.110:4444"),desiredCapabilities));
        getDriver().manage().window().maximize();
    }

}
