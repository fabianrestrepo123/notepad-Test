package co.com.test.notepad.task;

import co.com.test.notepad.iteractions.Wait;
import co.com.test.notepad.userinterface.notePadInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.notepad.userinterface.notePadInicio.*;
import static co.com.test.notepad.utils.constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class agregarNota implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RICH_TEXT),
                Wait.theSeconds(1),
                Click.on(BOLD_FONT),
                Wait.theSeconds(1),
                Click.on(EDITOR),
                Enter.theValue(TEXTO).into(EDITOR),
                Click.on(BUTTON_SAVE)
        );
    }

    public static agregarNota AgregarNota() {
        return instrumented(agregarNota.class);
    }
}
