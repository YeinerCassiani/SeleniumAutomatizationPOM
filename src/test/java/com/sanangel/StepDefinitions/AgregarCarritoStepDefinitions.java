package com.sanangel.StepDefinitions;

import com.sanangel.Steps.PaginaPrincipalStep;
import com.sanangel.Steps.PaginaProductoStep;
import com.sanangel.Steps.ValidacionesStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarCarritoStepDefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaProductoStep paginaProductoStep;

    @Steps
    ValidacionesStep validacionesStep;

    @Cuando("^El escoja y haga clic a un producto$")
    public void elEscojaYHagaClicAUnProducto() {
        paginaPrincipalStep.seleccionarProducto();
    }

    @Cuando("^Haga clic en el boton 'Añadir al carrito'$")
    public void hagaClicEnElBotonAñadirAlCarrito() {
        paginaProductoStep.agregarCarrito();
    }

    @Entonces("^Se visualizara el mensaje de 'Finalizar compra' junto a la informacion del cliente y producto y un boton para realizar el pedido$")
    public void seVisualizaraElMensajeDeFinalizarCompraJuntoALaInformacionDelClienteYProductoYUnBotonParaRealizarElPedido() {
        validacionesStep.verificarCarrito();
    }
}
