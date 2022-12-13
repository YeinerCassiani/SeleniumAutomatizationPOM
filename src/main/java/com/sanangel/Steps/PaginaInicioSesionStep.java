package com.sanangel.Steps;

import com.sanangel.PageObject.PaginaInicioSesionPageObject;
import com.sanangel.PageObject.PaginaPrincipalPageObject;
import com.sanangel.Utils.DatosExcelListas;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioSesionStep {
    PaginaInicioSesionPageObject paginaInicioSesionPageObject = new PaginaInicioSesionPageObject();
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Step
    public void IngresarDatos() throws IOException {
        leerExcel = DatosExcelListas.readExcel("Datos.xlsx", "Ingreso");
        paginaPrincipalPageObject.getDriver().findElement(paginaInicioSesionPageObject.getTxtUsuario()).sendKeys(leerExcel.get(0).get("User"));
        paginaPrincipalPageObject.getDriver().findElement(paginaInicioSesionPageObject.getTxtContrasena()).sendKeys(leerExcel.get(1).get("User"));
        paginaPrincipalPageObject.getDriver().findElement(paginaInicioSesionPageObject.getBtnAcceder()).click();
    }
}
