package com.saucedemo.StepDefinitios;

import com.saucedemo.models.InformacionUsuario;
import com.saucedemo.tasks.CompletarCompra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;

import static com.saucedemo.ui.ResumenPage.TXT_TEXTO_FINAL_COMPRA;

public class ConfirmarCompraStepDefinition {


    @Cuando("^completo la compra del producto$")
    public void completoLaCompraDelProducto(List<InformacionUsuario> usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarCompra.ok(usuario.get(0).getNombre(),usuario.get(0).getApellido(),
                usuario.get(0).getCodigo_postal()));

    }


    @Entonces("^valido que se presente el mensaje de confirmacion \"([^\"]*)\"$")
    public void validoQueSePresenteElMensajeDeConfirmacion(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_TEXTO_FINAL_COMPRA), WebElementStateMatchers.containsOnlyText(mensaje)));

    }





}
