package com.sanangel.Steps;

import com.sanangel.PageObject.PaginaPrincipalPageObject;
import com.sanangel.PageObject.ValidacionesPageObject;
import com.sanangel.Utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidacionesStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    ValidacionesPageObject validacionesPageObject = new ValidacionesPageObject();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    @Step
    public void validarMensaje() throws IOException {
        leerExcel = DatosExcelListas.readExcel("Datos.xlsx", "Ingreso");
        String validar = paginaPrincipalPageObject.getDriver().findElement(validacionesPageObject.getMsgValidacion()).getText();
        String correo = leerExcel.get(0).get("User");
        Assert.assertEquals(correo.substring(0, correo.indexOf("@")),validar);
    }

    @Step
    public void verificarCarrito(){
        String validar = paginaPrincipalPageObject.getDriver().findElement(validacionesPageObject.getMsgVerificacionCarrito()).getText();
        Assert.assertEquals("Finalizar compra",validar);
    }
}
