package com.sanangel.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaProductoPageObject extends PageObject {
    By btnAgregar = By.xpath("//button[@name=\"add-to-cart\"]");

    public By getBtnAgregar() {
        return btnAgregar;
    }
}
