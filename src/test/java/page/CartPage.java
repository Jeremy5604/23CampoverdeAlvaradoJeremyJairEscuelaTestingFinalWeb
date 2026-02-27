package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {

    @FindBy(css = "span.title")
    WebElementFacade tituloCarrito;

    @FindBy(css = "div.cart_item")
    List<WebElementFacade> listaProductosCarrito;

    @FindBy(css = "div.inventory_item_name")
    List<WebElementFacade> nombresProductosCarrito;

    @FindBy(css = "div.item_pricebar div.inventory_item_price")
    List<WebElementFacade> preciosProductosCarrito;

    @FindBy(css = "div.cart_quantity")
    List<WebElementFacade> cantidadesProductosCarrito;

    @FindBy(id = "continue-shopping")
    WebElementFacade botonContinuarComprando;

    @FindBy(id = "checkout")
    WebElementFacade botonCheckout;

    public String obtenerTituloCarrito() {
        tituloCarrito.waitUntilVisible();
        return tituloCarrito.getText();
    }

    public int obtenerCantidadProductosEnCarrito() {
        return listaProductosCarrito.size();
    }

    public boolean productoEstaEnCarrito(String nombreProducto) {
        for (WebElementFacade nombre : nombresProductosCarrito) {
            if (nombre.getText().equals(nombreProducto)) {
                return true;
            }
        }
        return false;
    }

    public void removerProductoDelCarrito(String nombreProducto) {
        String identificador = "remove-" + nombreProducto.toLowerCase()
                .replace(" ", "-")
                .replace("(", "")
                .replace(")", "");
        find(By.cssSelector("button[data-test='" + identificador + "']")).click();
    }

    public String obtenerPrecioProductoEnCarrito(String nombreProducto) {
        for (int i = 0; i < nombresProductosCarrito.size(); i++) {
            if (nombresProductosCarrito.get(i).getText().equals(nombreProducto)) {
                return preciosProductosCarrito.get(i).getText();
            }
        }
        return "";
    }

    public String obtenerCantidadProductoEnCarrito(String nombreProducto) {
        for (int i = 0; i < nombresProductosCarrito.size(); i++) {
            if (nombresProductosCarrito.get(i).getText().equals(nombreProducto)) {
                return cantidadesProductosCarrito.get(i).getText();
            }
        }
        return "";
    }

    public void clickContinuarComprando() {
        botonContinuarComprando.click();
    }

    public void clickCheckout() {
        botonCheckout.click();
    }

    public boolean esUrlCheckoutPasoUno() {
        return getDriver().getCurrentUrl().contains("checkout-step-one.html");
    }
}

