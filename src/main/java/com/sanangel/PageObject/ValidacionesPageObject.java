package com.sanangel.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionesPageObject extends PageObject{
    By msgValidacion = By.xpath("//strong[contains(text(),'')][1]");
    By msgVerificacionCarrito = By.xpath("//h1[contains(text(),'Finalizar compra')]");

    public By getMsgValidacion() {
        return msgValidacion;
    }

    public By getMsgVerificacionCarrito() {
        return msgVerificacionCarrito;
    }
}
