package com.saucedemo.StepDefinitios;

import com.saucedemo.models.Usuarios;
import com.saucedemo.tasks.InicioSesion;
import com.saucedemo.utils.DriverControler;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

import static com.saucedemo.ui.HomePage.*;

public class InicioSesionStepDefinition {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que me encuentro en la pagina de \"([^\"]*)\"$")
    public void queMeEncuentroEnLaPaginaDe(String url) {
        OnStage.theActorCalled("kevin").can(BrowseTheWeb.with(DriverControler.chromeHisBrowserWeb().on(url)));
    }


    @Cuando("^realizo el logueo en la pagina con las credenciales$")
    public void realizoElLogueoEnLaPaginaConLasCredenciales(List<Usuarios> usuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.con(usuarios.get(0).getUsuario(),usuarios.get(0).getContrasena()));

    }

    @Entonces("^valido en pantalla el \"([^\"]*)\"$")
    public void validoEnPantallaEl(String mensaje) {
        if (mensaje.contains("Labs")){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_TITULO_ENCABEZADO), WebElementStateMatchers.containsOnlyText(mensaje)));
        }
        else {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_MENSAJE_ERROR), WebElementStateMatchers.containsOnlyText(mensaje)));
        }
    }

}
