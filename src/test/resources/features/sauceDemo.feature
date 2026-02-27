# language: es

Característica: Como QE quiero automatizar el Login
  de la página SauceDemo para poder
  entender y hacer una automatización web

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo

  @SAUCE-1 @HappyPath
  Esquema del escenario: Login exitoso con usuarios válidos
    Cuando escribo el usuario <tipoUsuario>
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces carga pagina home mostrando el logo
    Ejemplos:
      | tipoUsuario     |
      | "estandar"      |
      | "problema"      |
      | "rendimiento"   |
      | "error"         |
      | "visual"        |

  @SAUCE-2 @HappyPath
  Escenario: Login exitoso con usuario estándar y verificar título de la página
    Cuando escribo el usuario "estandar"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces carga pagina home mostrando el logo
    Y el título de la página de productos es visible


  @SAUCE-3 @UnhappyPath
  Escenario: Login fallido con campos vacíos
    Cuando hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username is required"

  @SAUCE-4 @UnhappyPath
  Escenario: Login fallido sin contraseña
    Cuando escribo el usuario "estandar"
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Password is required"

  @SAUCE-5 @UnhappyPath
  Escenario: Login fallido sin usuario
    Cuando escribo la contraseña válida
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username is required"

  @SAUCE-6 @UnhappyPath
  Escenario: Login fallido con usuario bloqueado
    Cuando escribo el usuario "bloqueado"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Sorry, this user has been locked out."

  @SAUCE-7 @UnhappyPath
  Escenario: Login fallido con credenciales incorrectas
    Cuando escribo un usuario inexistente "usuario_invalido"
    Y escribo una contraseña incorrecta "clave_invalida"
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @SAUCE-8 @UnhappyPath
  Escenario: Login fallido con usuario válido y contraseña incorrecta
    Cuando escribo el usuario "estandar"
    Y escribo una contraseña incorrecta "clave_incorrecta"
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @SAUCE-9 @UnhappyPath
  Escenario: Login fallido con usuario incorrecto y contraseña válida
    Cuando escribo un usuario inexistente "usuario_inexistente"
    Y escribo la contraseña válida
    Y hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @SAUCE-10 @UnhappyPath
  Escenario: Verificar que el mensaje de error se puede cerrar
    Cuando hago click en el botón Login
    Entonces se muestra el mensaje de error "Epic sadface: Username is required"
    Cuando cierro el mensaje de error
    Entonces el mensaje de error no es visible

