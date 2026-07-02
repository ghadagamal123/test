package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.herokuapp;

import java.util.List;

public class heroherokuappTest extends BaseTest {
    @Override
    @BeforeMethod
    public void setup() {
        // 1. Still call the driver setup if you have a separate init method,
        // or recreate the initialization manually to overwrite behavior:
        driver = new ChromeDriver();

        // 2. Overwrite the navigation completely here
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void testCustomNavigation() {
        herokuapp herokuapp = new herokuapp(driver);
        herokuapp.selectcheckbox();
        List <WebElement> option=herokuapp.getcheckboxes();
        for (WebElement checkbox : option) {
            System.out.println("Checkbox is selected: " + checkbox.isSelected());
            Assert.assertTrue(checkbox.isSelected());}

    }

}
