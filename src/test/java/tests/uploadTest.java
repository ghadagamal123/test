package tests;

import Pages.Uploadpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class uploadTest extends TestCase {
    Uploadpage uploadpage;
    @Test
    public void uploadfile(){
        uploadpage=new Uploadpage(bot);
        bot.AsserTextEqual(uploadpage.h1,"File Uploaded!");
    }

}
