package com.saucedemo.StepDefinitios;

import com.saucedemo.tasks.AdicionarProducto;
import com.saucedemo.tasks.InicioSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.saucedemo.ui.HomePage.*;

public class AdicionDeProductoStepDefinition {


    @Dado("^inicio sesion con las credenciales \"([^\"]*)\" y \"([^\"]*)\"$")
    public void inicioSesionConLasCredencialesY(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.con(user,pass));
    }


    @Cuando("^adiciono un producto  al carro de compras$")
    public void adicionoUnProductoAlCarroDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(AdicionarProducto.en());
    }


    @Entonces("^valido que el producto sea \"([^\"]*)\"$")
    public void validoQueElProductoSea(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_NOMBRE_PRODUCTO), WebElementStateMatchers.containsOnlyText(producto)));

    }
}
