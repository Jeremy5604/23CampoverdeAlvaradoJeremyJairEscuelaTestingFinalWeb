package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    @FindBy(css = "span.title")
    WebElementFacade tituloProductos;

    @FindBy(css = "div.inventory_item")
    List<WebElementFacade> listaProductos;

    @FindBy(css = "select[data-test='product-sort-container']")
    WebElementFacade selectorOrden;

    @FindBy(css = "a.shopping_cart_link")
    WebElementFacade iconoCarrito;

    @FindBy(css = "span.shopping_cart_badge")
    WebElementFacade contadorCarrito;

    @FindBy(id = "react-burger-menu-btn")
    WebElementFacade botonMenuHamburguesa;

    @FindBy(css = "div.bm-menu-wrap")
    WebElementFacade menuLateral;

    @FindBy(id = "logout_sidebar_link")
    WebElementFacade enlaceCerrarSesion;

    @FindBy(id = "about_sidebar_link")
    WebElementFacade enlaceAcercaDe;

    @FindBy(id = "reset_sidebar_link")
    WebElementFacade enlaceReiniciarEstado;

    @FindBy(id = "react-burger-cross-btn")
    WebElementFacade botonCerrarMenu;

    @FindBy(css = "div.inventory_item_name")
    List<WebElementFacade> nombresProductos;

    @FindBy(css = "div.inventory_item_price")
    List<WebElementFacade> preciosProductos;

    public boolean esTituloProductosVisible() {
        tituloProductos.waitUntilVisible();
        return tituloProductos.isDisplayed();
    }

    public int obtenerCantidadProductos() {
        return listaProductos.size();
    }

    public void agregarProductoAlCarrito(String nombreProducto) {
        String identificador = "add-to-cart-" + nombreProducto.toLowerCase()
                .replace(" ", "-")
                .replace("(", "")
                .replace(")", "");
        find(By.cssSelector("button[data-test='" + identificador + "']")).click();
    }

    public void removerProductoDelCarrito(String nombreProducto) {
        String identificador = "remove-" + nombreProducto.toLowerCase()
                .replace(" ", "-")
                .replace("(", "")
                .replace(")", "");
        find(By.cssSelector("button[data-test='" + identificador + "']")).click();
    }

    public String obtenerTextoContadorCarrito() {
        contadorCarrito.waitUntilVisible();
        return contadorCarrito.getText();
    }

    public boolean esContadorCarritoVisible() {
        return contadorCarrito.isCurrentlyVisible();
    }

    public void ordenarProductosPor(String opcion) {
        selectorOrden.selectByVisibleText(opcion);
    }

    public String obtenerNombrePrimerProducto() {
        return nombresProductos.get(0).getText();
    }

    public String obtenerTextoBotonProducto(String nombreProducto) {
        String identificador = "remove-" + nombreProducto.toLowerCase()
                .replace(" ", "-")
                .replace("(", "")
                .replace(")", "");
        return find(By.cssSelector("button[data-test='" + identificador + "']")).getText();
    }

    public void clickIconoCarrito() {
        iconoCarrito.click();
    }

    public boolean esUrlPaginaCarrito() {
        return getDriver().getCurrentUrl().contains("cart.html");
    }

    public void clickMenuHamburguesa() {
        botonMenuHamburguesa.click();
    }

    public boolean esMenuLateralVisible() {
        menuLateral.waitUntilVisible();
        return menuLateral.isDisplayed();
    }

    public void clickOpcionMenuLateral(String opcion) {
        switch (opcion) {
            case "Logout":
                enlaceCerrarSesion.waitUntilClickable().click();
                break;
            case "About":
                enlaceAcercaDe.waitUntilClickable().click();
                break;
            case "Reset App State":
                enlaceReiniciarEstado.waitUntilClickable().click();
                break;
        }
    }

    public void cerrarMenuLateral() {
        botonCerrarMenu.click();
    }

    public boolean esUrlPaginaLogin() {
        return getDriver().getCurrentUrl().contains("saucedemo.com") &&
                !getDriver().getCurrentUrl().contains("inventory");
    }

    public String obtenerPrecioProducto(String nombreProducto) {
        for (int i = 0; i < nombresProductos.size(); i++) {
            if (nombresProductos.get(i).getText().equals(nombreProducto)) {
                return preciosProductos.get(i).getText();
            }
        }
        return "";
    }

    public void clickEnProductoPorNombre(String nombreProducto) {
        for (WebElementFacade nombre : nombresProductos) {
            if (nombre.getText().equals(nombreProducto)) {
                nombre.click();
                break;
            }
        }
    }

    public boolean esUrlPaginaDetalleProducto() {
        return getDriver().getCurrentUrl().contains("inventory-item.html");
    }
}

