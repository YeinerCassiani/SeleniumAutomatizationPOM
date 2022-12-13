#language: es
Característica: Login

  @Login

  Escenario: Login de usuario exitoso
    Dado Que el usuario se encuentra en la pagina web
    Y Haga clic en el icono de usuario
    Cuando El ingrese el usuario con la clave
    Entonces Se visualizara el mensaje de bienvenida junto a tu usuario