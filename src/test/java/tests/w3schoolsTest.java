package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.w3schoolpage;

public class w3schoolsTest extends TestCase {

    @Test
    public void ValidateUpload() {
    w3schoolpage w3schoolpage = new w3schoolpage(bot);
    w3schoolpage.navigateToW3SchoolPage();
    bot.AsserTextEqual(w3schoolpage.country,"Austria");
    }

}
