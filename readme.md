# 🧪 Automatización Web - SauceDemo con Serenity BDD

## Descripción

Este proyecto es una automatización de pruebas funcionales para el sitio web [SauceDemo](https://www.saucedemo.com), desarrollado con **Serenity BDD**, **Cucumber** y **Selenium WebDriver** utilizando el patrón **Page Object Model (POM)**.

El objetivo es validar las funcionalidades principales del sitio como el inicio de sesión, la navegación por el inventario de productos, el carrito de compras y el proceso de checkout.

## Casos de Prueba

### Login (`sauceDemo.feature`) - 10 escenarios
- **Happy Path**: Login exitoso con múltiples usuarios válidos, verificación de título
- **Unhappy Path**: Campos vacíos, sin contraseña, sin usuario, usuario bloqueado, credenciales incorrectas, cerrar mensaje de error

### Inventario (`inventory.feature`) - 17 escenarios
- **Happy Path**: Verificar cantidad de productos, agregar/remover del carrito, ordenar productos, navegar al carrito, menú lateral, cerrar sesión, ver detalle de producto
- **Unhappy Path**: Agregar y remover todos los productos, Reset App State

### Carrito (`cart.feature`) - 11 escenarios
- **Happy Path**: Carrito vacío, agregar un/múltiples productos, remover productos, verificar precio y cantidad, navegar a Continue Shopping y Checkout, verificar título
- **Unhappy Path**: Remover todos los productos, ir al checkout con carrito vacío

### Checkout (`checkout.feature`) - 11 escenarios
- **Happy Path**: Completar checkout con datos válidos, finalizar compra, verificar títulos, verificar total, volver al inicio con Back Home, cancelar desde paso uno y paso dos
- **Unhappy Path**: Sin nombre, sin apellido, sin código postal

## Cómo Ejecutar

### Requisitos Previos
- Java 17 instalado
- Maven 3.x instalado
- Google Chrome instalado

### Ejecutar todas las pruebas
```bash
mvn clean verify
```

### Ejecutar solo Happy Path
```bash
mvn clean verify -Dcucumber.filter.tags="@HappyPath"
```

### Ejecutar solo Unhappy Path
```bash
mvn clean verify -Dcucumber.filter.tags="@UnhappyPath"
```

### Ejecutar desde el IDE
Ejecutar directamente los archivos Runner como pruebas JUnit:
- `SauceRunner.java` → Pruebas de Login
- `InventoryRunner.java` → Pruebas de Inventario
- `CartRunner.java` → Pruebas del Carrito
- `CheckoutRunner.java` → Pruebas de Checkout



