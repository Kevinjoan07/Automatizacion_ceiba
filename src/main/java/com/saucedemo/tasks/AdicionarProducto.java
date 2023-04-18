package com.saucedemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.ui.HomePage.*;

public class AdicionarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ADICIONAR_PRODUCTO),Click.on(BTN_CONSULTAR_CARRITO));

    }

    public static AdicionarProducto en(){
        return Instrumented.instanceOf(AdicionarProducto.class).withProperties();
    }

}
