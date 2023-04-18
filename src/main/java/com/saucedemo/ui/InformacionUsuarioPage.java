package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionUsuarioPage {

    public static final Target TXT_NOMBRE = Target.the("Campo nombre").located(By.id("first-name"));
    public static final Target TXT_APELLIDO = Target.the("Campo apellido").located(By.id("last-name"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("Campo codigo postal").located(By.name("postalCode"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").located(By.name("continue"));
}
