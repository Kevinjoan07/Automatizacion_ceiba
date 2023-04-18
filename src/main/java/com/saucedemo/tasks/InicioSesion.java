package com.saucedemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.ui.InicioSesionPage.*;

public class InicioSesion implements Task {


    public String usuario, contrasena;

    public InicioSesion(String  usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena= contrasena;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(USUARIO),
                Enter.theValue(contrasena).into(PASSWORD),
                Click.on(BTN_SUBMIT));

    }

    public static InicioSesion con(String usuario, String contrasena){
        return Instrumented.instanceOf(InicioSesion.class).withProperties(usuario, contrasena);
    }

}
