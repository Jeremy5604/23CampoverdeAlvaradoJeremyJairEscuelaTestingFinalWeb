package steps;

import net.serenitybdd.annotations.Step;
import page.CheckoutPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutSteps {

    CheckoutPage paginaCheckout;

    @Step("Ingreso el nombre: {0}")
    public void ingresarNombre(String nombre) {
        paginaCheckout.ingresarNombre(nombre);
    }

    @Step("Ingreso el apellido: {0}")
    public void ingresarApellido(String apellido) {
        paginaCheckout.ingresarApellido(apellido);
    }

    @Step("Ingreso el código postal: {0}")
    public void ingresarCodigoPostal(String codigoPostal) {
        paginaCheckout.ingresarCodigoPostal(codigoPostal);
    }

    @Step("Click en el botón Continue")
    public void clickContinuar() {
        paginaCheckout.clickContinuar();
    }

    @Step("Click en el botón Cancel en checkout")
    public void clickCancelar() {
        paginaCheckout.clickCancelar();
    }

    @Step("Verificar que estoy en la página de checkout paso dos")
    public void verificarPaginaCheckoutPasoDos() {
        assertThat(paginaCheckout.esUrlCheckoutPasoDos()).isTrue();
    }

    @Step("Verificar que el resumen muestra el producto: {0}")
    public void verificarProductoEnResumen(String nombreEsperado) {
        assertThat(paginaCheckout.obtenerNombreProductoResumen()).isEqualTo(nombreEsperado);
    }

    @Step("Verificar que el precio del item en el resumen es: {0}")
    public void verificarPrecioItemResumen(String precioEsperado) {
        assertThat(paginaCheckout.obtenerPrecioProductoResumen()).isEqualTo(precioEsperado);
    }

    @Step("Click en el botón Finish")
    public void clickFinalizar() {
        paginaCheckout.clickFinalizar();
    }

    @Step("Verificar que estoy en la página de checkout completo")
    public void verificarPaginaCheckoutCompleto() {
        assertThat(paginaCheckout.esUrlCheckoutCompleto()).isTrue();
    }

    @Step("Verificar que se muestra el mensaje de confirmación: {0}")
    public void verificarMensajeConfirmacion(String mensajeEsperado) {
        assertThat(paginaCheckout.obtenerMensajeConfirmacion()).isEqualTo(mensajeEsperado);
    }

    @Step("Click en el botón Back Home")
    public void clickVolverInicio() {
        paginaCheckout.clickVolverInicio();
    }

    @Step("Verificar el título de la página: {0}")
    public void verificarTituloPagina(String tituloEsperado) {
        assertThat(paginaCheckout.obtenerTituloPagina()).isEqualTo(tituloEsperado);
    }

    @Step("Verificar que se muestra error en checkout: {0}")
    public void verificarErrorCheckout(String mensajeEsperado) {
        assertThat(paginaCheckout.obtenerMensajeErrorCheckout()).isEqualTo(mensajeEsperado);
    }

    @Step("Verificar que estoy en la página del carrito")
    public void verificarPaginaCarrito() {
        assertThat(paginaCheckout.esUrlCarrito()).isTrue();
    }
}

