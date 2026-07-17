package Pages;

import Engine.BotActions;
import org.openqa.selenium.By;

public class DragDropPage {
    By source = By.xpath("//div[@id='draggable']");
    By target =By.xpath("//div[@id='droppable']");
    BotActions bot;
   public By droppableText=By.xpath("//div[@id='droppable']/p");

    public void Navigate(){
        bot.Natigate("https://jqueryui.com/resources/demos/droppable/default.html");
    }
    public DragDropPage(BotActions bot){
       // bot= this.bot;
        this.bot=bot;
    }

    public void draganddrop(){
        bot.DragandDrop(source,target);
    }
}
