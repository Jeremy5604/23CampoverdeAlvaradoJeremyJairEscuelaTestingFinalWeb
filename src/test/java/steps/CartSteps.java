package steps;

import net.serenitybdd.annotations.Step;
import page.CartPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps {

    CartPage paginaCarrito;

    @Step("Verificar que el carrito tiene {0} productos")
    public void verificarCantidadProductosEnCarrito(int cantidad) {
        assertThat(paginaCarrito.obtenerCantidadProductosEnCarrito()).isEqualTo(cantidad);
    }

    @Step("Verificar que el carrito no tiene productos")
    public void verificarCarritoVacio() {
        assertThat(paginaCarrito.obtenerCantidadProductosEnCarrito()).isEqualTo(0);
    }

    @Step("Verificar que el producto {0} está en el carrito")
    public void verificarProductoEnCarrito(String nombreProducto) {
        assertThat(paginaCarrito.productoEstaEnCarrito(nombreProducto)).isTrue();
    }

    @Step("Remover el producto {0} del carrito")
    public void removerProductoDelCarrito(String nombreProducto) {
        paginaCarrito.removerProductoDelCarrito(nombreProducto);
    }

    @Step("Verificar que el precio del producto {0} en el carrito es: {1}")
    public void verificarPrecioProductoEnCarrito(String nombreProducto, String precioEsperado) {
        assertThat(paginaCarrito.obtenerPrecioProductoEnCarrito(nombreProducto)).isEqualTo(precioEsperado);
    }

    @Step("Verificar que la cantidad del producto {0} en el carrito es: {1}")
    public void verificarCantidadProductoEnCarrito(String nombreProducto, String cantidadEsperada) {
        assertThat(paginaCarrito.obtenerCantidadProductoEnCarrito(nombreProducto)).isEqualTo(cantidadEsperada);
    }

    @Step("Click en el botón Continue Shopping")
    public void clickContinuarComprando() {
        paginaCarrito.clickContinuarComprando();
    }

    @Step("Click en el botón Checkout")
    public void clickCheckout() {
        paginaCarrito.clickCheckout();
    }

    @Step("Verificar que estoy en la página de checkout paso uno")
    public void verificarPaginaCheckoutPasoUno() {
        assertThat(paginaCarrito.esUrlCheckoutPasoUno()).isTrue();
    }

    @Step("Verificar que el título del carrito es: {0}")
    public void verificarTituloCarrito(String tituloEsperado) {
        assertThat(paginaCarrito.obtenerTituloCarrito()).isEqualTo(tituloEsperado);
    }
}

