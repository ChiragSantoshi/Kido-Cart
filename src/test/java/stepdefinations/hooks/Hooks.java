package stepdefinations.hooks;

import factory.DriverFactory;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {
    DriverFactory  driverFactory = new DriverFactory();

    @Before
    public void setUp() throws MalformedURLException {
        driverFactory.setDriver("chrome");
    }
}
//yeh har scanrio ke pehle chalraha hai and sabko drivers de raha hai