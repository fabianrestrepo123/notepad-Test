package co.com.test.notepad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class notePadInicio {

    public static final Target RICH_TEXT = Target.the("Click in Rich Text Note").
            locatedBy("(//*[@id='richtextnote-tab'])[1]");

    public static final Target BOLD_FONT = Target.the("Click in Blod font").
            locatedBy("(//*[@class='ck ck-button ck-off'])[1]");

    public static final Target EDITOR = Target.the("Click in editor").
            located(By.id("editor"));

    public static final Target BUTTON_SAVE = Target.the("Click in save").
            locatedBy("(//*[@class='btn save-file-btn saveNotesBtn richtextnoteBtn'])");


}
