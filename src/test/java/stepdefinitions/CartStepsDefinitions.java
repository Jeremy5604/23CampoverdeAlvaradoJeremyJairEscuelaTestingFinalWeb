package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.CartSteps;

public class CartStepsDefinitions {

    @Steps
    CartSteps pasosCarrito;

    @Y("el carrito no tiene productos")
    public void elCarritoNoTieneProductos() {
        pasosCarrito.verificarCarritoVacio();
    }

    @Y("el carrito tiene {int} producto(s)")
    public void elCarritoTieneProductos(int cantidad) {
        pasosCarrito.verificarCantidadProductosEnCarrito(cantidad);
    }

    @Y("el producto {string} está en el carrito")
    public void elProductoEstaEnElCarrito(String nombreProducto) {
        pasosCarrito.verificarProductoEnCarrito(nombreProducto);
    }

    @Cuando("remuevo el producto {string} del carrito")
    public void remuevoElProductoDelCarrito(String nombreProducto) {
        pasosCarrito.removerProductoDelCarrito(nombreProducto);
    }

    @Y("el precio del producto en el carrito {string} es {string}")
    public void elPrecioDelProductoEnElCarritoEs(String nombreProducto, String precioEsperado) {
        pasosCarrito.verificarPrecioProductoEnCarrito(nombreProducto, precioEsperado);
    }

    @Y("la cantidad del producto {string} en el carrito es {string}")
    public void laCantidadDelProductoEnElCarritoEs(String nombreProducto, String cantidadEsperada) {
        pasosCarrito.verificarCantidadProductoEnCarrito(nombreProducto, cantidadEsperada);
    }

    @Cuando("hago click en el botón Continue Shopping")
    public void hagoClickEnElBotonContinueShopping() {
        pasosCarrito.clickContinuarComprando();
    }

    @Cuando("hago click en el botón Checkout")
    public void hagoClickEnElBotonCheckout() {
        pasosCarrito.clickCheckout();
    }

    @Entonces("estoy en la página de checkout paso uno")
    public void estoyEnLaPaginaDeCheckoutPasoUno() {
        pasosCarrito.verificarPaginaCheckoutPasoUno();
    }

    @Y("el título de la página del carrito es {string}")
    public void elTituloDeLaPaginaDelCarritoEs(String tituloEsperado) {
        pasosCarrito.verificarTituloCarrito(tituloEsperado);
    }
}

