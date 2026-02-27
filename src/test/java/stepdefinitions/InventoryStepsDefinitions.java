package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.InventorySteps;

public class InventoryStepsDefinitions {

    @Steps
    InventorySteps pasosInventario;

    @Entonces("se muestran {int} productos en el inventario")
    public void seMuestranProductosEnElInventario(int cantidad) {
        pasosInventario.verificarCantidadProductos(cantidad);
    }

    @Cuando("agrego al carrito el producto {string}")
    public void agregoAlCarritoElProducto(String nombreProducto) {
        pasosInventario.agregarProductoAlCarrito(nombreProducto);
    }

    @Cuando("remuevo del carrito el producto {string}")
    public void remuevoDelCarritoElProducto(String nombreProducto) {
        pasosInventario.removerProductoDelCarrito(nombreProducto);
    }

    @Entonces("el badge del carrito muestra {string}")
    public void elBadgeDelCarritoMuestra(String cantidad) {
        pasosInventario.verificarContadorCarrito(cantidad);
    }

    @Entonces("el badge del carrito no es visible")
    public void elBadgeDelCarritoNoEsVisible() {
        pasosInventario.verificarContadorCarritoNoVisible();
    }

    @Cuando("ordeno los productos por {string}")
    public void ordenoLosProductosPor(String opcion) {
        pasosInventario.ordenarProductosPor(opcion);
    }

    @Entonces("el primer producto es {string}")
    public void elPrimerProductoEs(String nombreEsperado) {
        pasosInventario.verificarPrimerProducto(nombreEsperado);
    }

    @Entonces("el botón del producto {string} muestra {string}")
    public void elBotonDelProductoMuestra(String nombreProducto, String textoEsperado) {
        pasosInventario.verificarBotonProducto(nombreProducto, textoEsperado);
    }

    @Cuando("hago click en el icono del carrito")
    public void hagoClickEnElIconoDelCarrito() {
        pasosInventario.clickEnIconoCarrito();
    }

    @Entonces("estoy en la página del carrito")
    public void estoyEnLaPaginaDelCarrito() {
        pasosInventario.verificarPaginaCarrito();
    }

    @Cuando("hago click en el menú hamburguesa")
    public void hagoClickEnElMenuHamburguesa() {
        pasosInventario.clickEnMenuHamburguesa();
    }

    @Entonces("el menú lateral es visible")
    public void elMenuLateralEsVisible() {
        pasosInventario.verificarMenuLateralVisible();
    }

    @Y("hago click en la opción {string}")
    public void hagoClickEnLaOpcion(String opcion) {
        pasosInventario.clickEnOpcionMenu(opcion);
    }

    @Entonces("estoy en la página de login")
    public void estoyEnLaPaginaDeLogin() {
        pasosInventario.verificarPaginaLogin();
    }

    @Entonces("el precio del producto {string} es {string}")
    public void elPrecioDelProductoEs(String nombreProducto, String precioEsperado) {
        pasosInventario.verificarPrecioProducto(nombreProducto, precioEsperado);
    }

    @Cuando("hago click en el producto {string}")
    public void hagoClickEnElProducto(String nombreProducto) {
        pasosInventario.clickEnProducto(nombreProducto);
    }

    @Entonces("estoy en la página de detalle del producto")
    public void estoyEnLaPaginaDeDetalleDelProducto() {
        pasosInventario.verificarPaginaDetalleProducto();
    }

    @Y("hago click en cerrar menú lateral")
    public void hagoClickEnCerrarMenuLateral() {
        pasosInventario.cerrarMenuLateral();
    }
}


