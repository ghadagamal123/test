package tests;

import Pages.DragDropPage;
import org.testng.annotations.Test;

public class DragDropTest extends TestCase {
    DragDropPage dragDropPage;
    @Test
    public void ValidateDraganddrop(){
        dragDropPage = new DragDropPage(bot);
        dragDropPage.draganddrop();
        bot.AsserTextEqual3(dragDropPage.droppableText);
    }
}
