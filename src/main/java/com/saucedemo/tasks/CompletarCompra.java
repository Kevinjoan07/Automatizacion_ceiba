package com.saucedemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.ui.InformacionUsuarioPage.*;
import static com.saucedemo.ui.InventarioPage.BTN_CHECKOUT;
import static com.saucedemo.ui.ResumenPage.BTN_FINALIZAR;

public class CompletarCompra implements Task {

    public String nombre, apelido,codigo_postal;

    public CompletarCompra(String nombre, String apelido, String codigo_postal) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.codigo_postal = codigo_postal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CHECKOUT), Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(apelido).into(TXT_APELLIDO),Enter.theValue(codigo_postal).into(TXT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUAR),Click.on(BTN_FINALIZAR));

    }

    public static CompletarCompra ok(String nombre,String apellido, String codigo_postal){
        return Instrumented.instanceOf(CompletarCompra.class).withProperties(nombre,apellido,codigo_postal);
    }
}
