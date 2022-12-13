package com.sanangel.Steps;

import com.sanangel.PageObject.PaginaPrincipalPageObject;
import com.sanangel.PageObject.PaginaProductoPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaProductoStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    PaginaProductoPageObject paginaProductoPageObject = new PaginaProductoPageObject();

    @Step
    public void agregarCarrito(){
        paginaPrincipalPageObject.getDriver().findElement(paginaProductoPageObject.getBtnAgregar()).click();
    }
}
