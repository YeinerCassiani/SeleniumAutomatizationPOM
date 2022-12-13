package com.sanangel.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesionPageObject extends PageObject {
    By txtUsuario = By.xpath("//input[@name='username']");
    By txtContrasena = By.xpath("//form[@class='woocommerce-form woocommerce-form-login login']/p/span/input[@type='password']");
    By btnAcceder = By.xpath("//button[@name='login']");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getBtnAcceder() {
        return btnAcceder;
    }
}
