package com.sanangel.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://sanangel.com.co/")
public class PaginaPrincipalPageObject extends PageObject {
    By hlkUsuario = By.xpath("//header[@class='desktop-header']/div/nav/ul/li/a[@href='https://sanangel.com.co/mi-cuenta/']");
    By msgProductos = By.xpath("//li/a/span[contains(text(),'Destacados')]");
    By hlkProducto = By.xpath("//ul[@class='products columns-3']/li[1]/a[@href='https://sanangel.com.co/producto/evora/']");
    public By getHlkUsuario() {
        return hlkUsuario;
    }

    public By getMsgProductos() {
        return msgProductos;
    }

    public By getHlkProducto() {
        return hlkProducto;
    }
}
