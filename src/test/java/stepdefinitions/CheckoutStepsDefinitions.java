package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.CheckoutSteps;

public class CheckoutStepsDefinitions {

    @Steps
    CheckoutSteps pasosCheckout;

    @Cuando("ingreso el nombre {string}")
    public void ingresoElNombre(String nombre) {
        pasosCheckout.ingresarNombre(nombre);
    }

    @Y("ingreso el apellido {string}")
    public void ingresoElApellido(String apellido) {
        pasosCheckout.ingresarApellido(apellido);
    }

    @Y("ingreso el código postal {string}")
    public void ingresoElCodigoPostal(String codigoPostal) {
        pasosCheckout.ingresarCodigoPostal(codigoPostal);
    }

    @Y("hago click en el botón Continue")
    public void hagoClickEnElBotonContinue() {
        pasosCheckout.clickContinuar();
    }

    @Cuando("hago click en el botón Cancel en checkout")
    public void hagoClickEnElBotonCancelEnCheckout() {
        pasosCheckout.clickCancelar();
    }

    @Entonces("estoy en la página de checkout paso dos")
    public void estoyEnLaPaginaDeCheckoutPasoDos() {
        pasosCheckout.verificarPaginaCheckoutPasoDos();
    }

    @Y("el resumen muestra el producto {string}")
    public void elResumenMuestraElProducto(String nombreEsperado) {
        pasosCheckout.verificarProductoEnResumen(nombreEsperado);
    }

    @Y("el precio del item en el resumen es {string}")
    public void elPrecioDelItemEnElResumenEs(String precioEsperado) {
        pasosCheckout.verificarPrecioItemResumen(precioEsperado);
    }

    @Cuando("hago click en el botón Finish")
    public void hagoClickEnElBotonFinish() {
        pasosCheckout.clickFinalizar();
    }

    @Entonces("estoy en la página de checkout completo")
    public void estoyEnLaPaginaDeCheckoutCompleto() {
        pasosCheckout.verificarPaginaCheckoutCompleto();
    }

    @Y("se muestra el mensaje de confirmación {string}")
    public void seMuestraElMensajeDeConfirmacion(String mensajeEsperado) {
        pasosCheckout.verificarMensajeConfirmacion(mensajeEsperado);
    }

    @Cuando("hago click en el botón Back Home")
    public void hagoClickEnElBotonBackHome() {
        pasosCheckout.clickVolverInicio();
    }

    @Y("el título de la página es {string}")
    public void elTituloDeLaPaginaEs(String tituloEsperado) {
        pasosCheckout.verificarTituloPagina(tituloEsperado);
    }

    @Entonces("se muestra error en checkout {string}")
    public void seMuestraErrorEnCheckout(String mensajeEsperado) {
        pasosCheckout.verificarErrorCheckout(mensajeEsperado);
    }
}

