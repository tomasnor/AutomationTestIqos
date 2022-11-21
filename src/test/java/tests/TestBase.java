package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.Common;
import utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
        Common.close();
    }
}
