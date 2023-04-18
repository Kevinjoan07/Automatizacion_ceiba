package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TXT_TITULO_ENCABEZADO = Target.the("Texto validacion").locatedBy("//div[@class='header_label']");
    public static final Target BTN_ADICIONAR_PRODUCTO = Target.the("Boton adicionar producto").locatedBy("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final Target BTN_CONSULTAR_CARRITO = Target.the("Boton ingresar al carrito de compras").locatedBy("//a[@class='shopping_cart_link']");
    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Nombre del producto en el carrito de compras").locatedBy("//div[@class='inventory_item_name']");
    public static final Target TXT_MENSAJE_ERROR = Target.the("Mensaje de error al ingresar con credenciales bloqueadas").locatedBy("//div[@class='error-message-container error']");

}
