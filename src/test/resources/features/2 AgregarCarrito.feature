#language: es
Característica: Agregar al carrito

  @AgregarCarrito

  Escenario: Producto agregado al carrito exitosamente
    Dado Que el usuario se encuentra en la pagina web
    Cuando El escoja y haga clic a un producto
    Y Haga clic en el boton 'Añadir al carrito'
    Entonces Se visualizara el mensaje de 'Finalizar compra' junto a la informacion del cliente y producto y un boton para realizar el pedido