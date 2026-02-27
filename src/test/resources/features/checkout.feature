# language: es

Característica: Como QE quiero automatizar el flujo de Checkout
  de la página SauceDemo para poder verificar
  el proceso completo de compra

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "estandar"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces carga pagina home mostrando el logo
    Cuando agrego al carrito el producto "Sauce Labs Backpack"
    Y hago click en el icono del carrito
    Entonces estoy en la página del carrito

  @CHK-1 @HappyPath
  Escenario: Completar el checkout con datos válidos
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Juan"
    Y ingreso el apellido "Pérez"
    Y ingreso el código postal "10001"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Y el resumen muestra el producto "Sauce Labs Backpack"

  @CHK-2 @HappyPath
  Escenario: Finalizar la compra exitosamente
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Juan"
    Y ingreso el apellido "Pérez"
    Y ingreso el código postal "10001"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Cuando hago click en el botón Finish
    Entonces estoy en la página de checkout completo
    Y se muestra el mensaje de confirmación "Thank you for your order!"

  @CHK-3 @HappyPath
  Escenario: Verificar el título del checkout paso uno
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Y el título de la página es "Checkout: Your Information"

  @CHK-4 @HappyPath
  Escenario: Verificar el título del checkout paso dos
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "María"
    Y ingreso el apellido "López"
    Y ingreso el código postal "20002"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Y el título de la página es "Checkout: Overview"

  @CHK-5 @HappyPath
  Escenario: Verificar el total en el resumen del checkout
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Carlos"
    Y ingreso el apellido "García"
    Y ingreso el código postal "30003"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Y el precio del item en el resumen es "$29.99"

  @CHK-6 @HappyPath
  Escenario: Volver al inventario desde checkout completo con Back Home
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Ana"
    Y ingreso el apellido "Martínez"
    Y ingreso el código postal "40004"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Cuando hago click en el botón Finish
    Entonces estoy en la página de checkout completo
    Cuando hago click en el botón Back Home
    Entonces el título de la página de productos es visible

  @CHK-7 @HappyPath
  Escenario: Cancelar desde el checkout paso uno y volver al carrito
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando hago click en el botón Cancel en checkout
    Entonces estoy en la página del carrito

  @CHK-8 @HappyPath
  Escenario: Cancelar desde el checkout paso dos y volver al inventario
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Pedro"
    Y ingreso el apellido "Sánchez"
    Y ingreso el código postal "50005"
    Y hago click en el botón Continue
    Entonces estoy en la página de checkout paso dos
    Cuando hago click en el botón Cancel en checkout
    Entonces el título de la página de productos es visible


  @CHK-9 @UnhappyPath
  Escenario: Checkout sin completar ningún campo
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando hago click en el botón Continue
    Entonces se muestra error en checkout "Error: First Name is required"

  @CHK-10 @UnhappyPath
  Escenario: Checkout sin apellido
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Juan"
    Y hago click en el botón Continue
    Entonces se muestra error en checkout "Error: Last Name is required"

  @CHK-11 @UnhappyPath
  Escenario: Checkout sin código postal
    Cuando hago click en el botón Checkout
    Entonces estoy en la página de checkout paso uno
    Cuando ingreso el nombre "Juan"
    Y ingreso el apellido "Pérez"
    Y hago click en el botón Continue
    Entonces se muestra error en checkout "Error: Postal Code is required"

