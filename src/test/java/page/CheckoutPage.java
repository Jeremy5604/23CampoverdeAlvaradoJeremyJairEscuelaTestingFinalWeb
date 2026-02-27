package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    WebElementFacade campoNombre;

    @FindBy(id = "last-name")
    WebElementFacade campoApellido;

    @FindBy(id = "postal-code")
    WebElementFacade campoCodigoPostal;

    @FindBy(id = "continue")
    WebElementFacade botonContinuar;

    @FindBy(id = "cancel")
    WebElementFacade botonCancelar;

    @FindBy(css = "h3[data-test='error']")
    WebElementFacade mensajeErrorCheckout;

    @FindBy(css = "span.title")
    WebElementFacade tituloPagina;

    @FindBy(css = "div.inventory_item_name")
    WebElementFacade nombreProductoResumen;

    @FindBy(css = "div.inventory_item_price")
    WebElementFacade precioProductoResumen;

    @FindBy(css = "div.summary_subtotal_label")
    WebElementFacade subtotalResumen;

    @FindBy(css = "div.summary_tax_label")
    WebElementFacade impuestoResumen;

    @FindBy(css = "div.summary_total_label")
    WebElementFacade totalResumen;

    @FindBy(id = "finish")
    WebElementFacade botonFinalizar;

    @FindBy(css = "h2.complete-header")
    WebElementFacade mensajeConfirmacion;

    @FindBy(id = "back-to-products")
    WebElementFacade botonVolverInicio;

    public void ingresarNombre(String nombre) {
        campoNombre.type(nombre);
    }

    public void ingresarApellido(String apellido) {
        campoApellido.type(apellido);
    }

    public void ingresarCodigoPostal(String codigoPostal) {
        campoCodigoPostal.type(codigoPostal);
    }

    public void clickContinuar() {
        botonContinuar.click();
    }

    public void clickCancelar() {
        botonCancelar.click();
    }

    public String obtenerMensajeErrorCheckout() {
        mensajeErrorCheckout.waitUntilVisible();
        return mensajeErrorCheckout.getText();
    }

    public String obtenerTituloPagina() {
        tituloPagina.waitUntilVisible();
        return tituloPagina.getText();
    }

    public String obtenerNombreProductoResumen() {
        nombreProductoResumen.waitUntilVisible();
        return nombreProductoResumen.getText();
    }

    public String obtenerPrecioProductoResumen() {
        precioProductoResumen.waitUntilVisible();
        return precioProductoResumen.getText();
    }

    public void clickFinalizar() {
        botonFinalizar.click();
    }

    public boolean esUrlCheckoutPasoDos() {
        return getDriver().getCurrentUrl().contains("checkout-step-two.html");
    }

    public String obtenerMensajeConfirmacion() {
        mensajeConfirmacion.waitUntilVisible();
        return mensajeConfirmacion.getText();
    }

    public boolean esUrlCheckoutCompleto() {
        return getDriver().getCurrentUrl().contains("checkout-complete.html");
    }

    public void clickVolverInicio() {
        botonVolverInicio.click();
    }

    public boolean esUrlCarrito() {
        return getDriver().getCurrentUrl().contains("cart.html");
    }
}
