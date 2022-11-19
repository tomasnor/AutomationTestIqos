package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Common;

public class TestBase {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
        Common.close();
    }
}
