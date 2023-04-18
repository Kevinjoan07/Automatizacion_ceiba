package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumenPage {

    public static final Target BTN_FINALIZAR =Target.the("Boton finalizar").located(By.id("finish"));
    public static final Target TXT_TEXTO_FINAL_COMPRA =Target.the("Texto de finalizacion de compra").locatedBy("//div[@id='checkout_complete_container']/h2");

}
