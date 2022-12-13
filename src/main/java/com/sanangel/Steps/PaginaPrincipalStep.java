package com.sanangel.Steps;

import com.sanangel.PageObject.PaginaPrincipalPageObject;
import com.sanangel.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaginaPrincipalStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    Scroll scroll = new Scroll();

    @Step
    public void abrirNavegador(){
        paginaPrincipalPageObject.open();
    }

    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void ingreso(){
        click(paginaPrincipalPageObject.getHlkUsuario());
    }

    @Step
    public void seleccionarProducto(){
        scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getMsgProductos());
        click(paginaPrincipalPageObject.getHlkProducto());
    }
}
