package net.onlinenotepad.stepdefinitions;

import co.com.test.notepad.task.agregarNota;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepDefs {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Fabian");
    }

    @Given("El usuario ingresa a la pagina")
    public void elUsuarioIngresaALaPagina() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-\n" +
                "notas-online"));
    }

    @When("La nota se guarda")
    public void laNotaSeGuarda() {
        theActorInTheSpotlight().attemptsTo(agregarNota.AgregarNota());
    }


   /* @When("El usuario elemina la nota")
    public void elUsuarioEleminaLaNota() {

    }*/
}


