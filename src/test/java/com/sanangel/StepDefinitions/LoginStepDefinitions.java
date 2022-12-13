package com.sanangel.StepDefinitions;

import com.sanangel.Steps.PaginaInicioSesionStep;
import com.sanangel.Steps.PaginaPrincipalStep;
import com.sanangel.Steps.ValidacionesStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaInicioSesionStep paginaInicioSesionStep;

    @Steps
    ValidacionesStep validacionesStep;

    @Dado("^Que el usuario se encuentra en la pagina web$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Dado("^Haga clic en el icono de usuario$")
    public void hagaClicEnElIconoDeUsuario() {
        paginaPrincipalStep.ingreso();
    }

    @Cuando("^El ingrese el usuario con la clave$")
    public void elIngreseElUsuarioConLaClave() throws IOException {
        paginaInicioSesionStep.IngresarDatos();
    }

    @Entonces("^Se visualizara el mensaje de bienvenida junto a tu usuario$")
    public void seVisualizaraElMensajeDeBienvenidaJuntoATuUsuario() throws IOException {
        validacionesStep.validarMensaje();
    }
}
