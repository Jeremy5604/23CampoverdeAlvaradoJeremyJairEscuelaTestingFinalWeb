# language: es

Característica: Como QE quiero automatizar la página del Carrito
  de la página SauceDemo para poder verificar
  la gestión de productos en el carrito de compras

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "estandar"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces carga pagina home mostrando el logo

  @CART-1 @HappyPath
  Escenario: Verificar que el carrito está vacío inicialmente
    Cuando hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el carrito no tiene productos

  @CART-2 @HappyPath
  Escenario: Agregar un producto y verificar que aparece en el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el carrito tiene 1 producto
    Y el producto "Sauce Labs Backpack" está en el carrito

  @CART-3 @HappyPath
  Escenario: Agregar múltiples productos y verificar en el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Y agrego al carrito el producto "Sauce Labs Bolt T-Shirt"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el carrito tiene 3 productos

  @CART-4 @HappyPath
  Escenario: Remover un producto desde el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Cuando remuevo el producto "Sauce Labs Backpack" del carrito
    Entonces el carrito tiene 1 producto

  @CART-5 @HappyPath
  Escenario: Verificar el precio del producto en el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el precio del producto en el carrito "Sauce Labs Backpack" es "$29.99"

  @CART-6 @HappyPath
  Escenario: Verificar la cantidad del producto en el carrito
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y la cantidad del producto "Sauce Labs Backpack" en el carrito es "1"

  @CART-7 @HappyPath
  Escenario: Hacer click en Continue Shopping para volver al inventario
    Cuando hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Cuando hago click en el botón Continue Shopping
    Entonces el título de la página de productos es visible

  @CART-8 @HappyPath
  Escenario: Hacer click en Checkout para ir al formulario
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno

  @CART-9 @HappyPath
  Escenario: Verificar el título Your Cart en la página del carrito
    Cuando hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el título de la página del carrito es "Your Cart"


  @CART-10 @UnhappyPath
  Escenario: Remover todos los productos y verificar carrito vacío
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y agrego al carrito el producto "Sauce Labs Bike Light"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Cuando remuevo el producto "Sauce Labs Backpack" del carrito
    Y remuevo el producto "Sauce Labs Bike Light" del carrito
    Entonces el carrito no tiene productos

  @CART-11 @UnhappyPath
  Escenario: Ir al checkout con carrito vacío
    Cuando hago click en el icono del carrito
    Entonces estoy en la página del carrito
    Y el carrito no tiene productos
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno

