# language: es

Característica: Como QE quiero automatizar la página de Inventario
  de la página SauceDemo para poder verificar
  el listado de productos y sus funcionalidades

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "estandar"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces carga pagina home mostrando el logo

  @INV-1 @HappyPath
  Escenario: Verificar que se muestran 6 productos en el inventario
    Entonces se muestran 6 productos en el inventario

  @INV-2 @HappyPath
  Escenario: Verificar que el título Products es visible
    Entonces el título de la página de productos es visible

  @INV-3 @HappyPath
  Escenario: Agregar un producto al carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Entonces el badge del carrito muestra "1"

  @INV-4 @HappyPath
  Escenario: Agregar múltiples productos al carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Y agrego al carrito el producto "Sauce Labs Bolt T-Shirt"
    Entonces el badge del carrito muestra "3"

  @INV-5 @HappyPath
  Escenario: Remover un producto del carrito desde el inventario
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Entonces el badge del carrito muestra "1"
    Cuando remuevo del carrito el producto "Sauce Labs Backpack"
    Entonces el badge del carrito no es visible

  @INV-6 @HappyPath
  Escenario: Ordenar productos por nombre de Z a A
    Cuando ordeno los productos por "Name (Z to A)"
    Entonces el primer producto es "Test.allTheThings() T-Shirt (Red)"

  @INV-7 @HappyPath
  Escenario: Ordenar productos por nombre de A a Z
    Cuando ordeno los productos por "Name (A to Z)"
    Entonces el primer producto es "Sauce Labs Backpack"

  @INV-8 @HappyPath
  Escenario: Ordenar productos por precio de menor a mayor
    Cuando ordeno los productos por "Price (low to high)"
    Entonces el primer producto es "Sauce Labs Onesie"

  @INV-9 @HappyPath
  Escenario: Ordenar productos por precio de mayor a menor
    Cuando ordeno los productos por "Price (high to low)"
    Entonces el primer producto es "Sauce Labs Fleece Jacket"

  @INV-10 @HappyPath
  Escenario: Verificar que el botón cambia a Remove después de agregar al carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Entonces el botón del producto "Sauce Labs Backpack" muestra "Remove"

  @INV-11 @HappyPath
  Escenario: Navegar al carrito desde el inventario
    Cuando hago click en el icono del carrito
    Entonces estoy en la página del carrito

  @INV-12 @HappyPath
  Escenario: Abrir el menú lateral hamburguesa
    Cuando hago click en el menú hamburguesa
    Entonces el menú lateral es visible

  @INV-13 @HappyPath
  Escenario: Cerrar sesión desde el menú lateral
    Cuando hago click en el menú hamburguesa
    Y el menú lateral es visible
    Y hago click en la opción "Logout"
    Entonces estoy en la página de login

  @INV-14 @HappyPath
  Escenario: Verificar el precio del producto Sauce Labs Backpack
    Entonces el precio del producto "Sauce Labs Backpack" es "$29.99"

  @INV-15 @HappyPath
  Escenario: Hacer click en el nombre de un producto para ver su detalle
    Cuando hago click en el producto "Sauce Labs Backpack"
    Entonces estoy en la página de detalle del producto


  @INV-16 @UnhappyPath
  Escenario: Agregar y remover todos los productos y verificar que el badge desaparece
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Entonces el badge del carrito muestra "2"
    Cuando remuevo del carrito el producto "Sauce Labs Backpack"
    Y remuevo del carrito el producto "Sauce Labs Bike Light"
    Entonces el badge del carrito no es visible

  @INV-17 @UnhappyPath
  Escenario: Verificar que Reset App State limpia el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Entonces el badge del carrito muestra "2"
    Cuando hago click en el menú hamburguesa
    Y el menú lateral es visible
    Y hago click en la opción "Reset App State"
    Y hago click en cerrar menú lateral
    Entonces el badge del carrito no es visible

