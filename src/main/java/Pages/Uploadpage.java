package Pages;

import Engine.BotActions;
import org.openqa.selenium.By;

public class Uploadpage {
    By browseButton = By.id("file-upload");
    // File file = new File("src/test/resources/text.txt");
    String absolutePath = "C:\\Users\\HP\\Documents\\GitHub\\test\\src\\main\\resources\\text.txt";
    public By h1 = By.xpath("//div[@class='example']/h3");
    By uploadButton = By.id("file-submit");
    BotActions bot;
    public Uploadpage(BotActions bot) {
        this.bot = bot;
    }

    public void uploadfile(){
        bot.SelectFile(browseButton, absolutePath);
        bot.ClickUpload(uploadButton);
    }
}
