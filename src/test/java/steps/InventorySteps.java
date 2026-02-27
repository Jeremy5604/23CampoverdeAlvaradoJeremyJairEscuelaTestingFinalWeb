package steps;

import net.serenitybdd.annotations.Step;
import page.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;

public class InventorySteps {

    InventoryPage paginaInventario;

    @Step("Verificar que se muestran {0} productos en el inventario")
    public void verificarCantidadProductos(int cantidad) {
        assertThat(paginaInventario.obtenerCantidadProductos()).isEqualTo(cantidad);
    }

    @Step("Verificar que el título de productos es visible")
    public void verificarTituloProductosVisible() {
        assertThat(paginaInventario.esTituloProductosVisible()).isTrue();
    }

    @Step("Agregar al carrito el producto: {0}")
    public void agregarProductoAlCarrito(String nombreProducto) {
        paginaInventario.agregarProductoAlCarrito(nombreProducto);
    }

    @Step("Remover del carrito el producto: {0}")
    public void removerProductoDelCarrito(String nombreProducto) {
        paginaInventario.removerProductoDelCarrito(nombreProducto);
    }

    @Step("Verificar que el contador del carrito muestra: {0}")
    public void verificarContadorCarrito(String cantidad) {
        assertThat(paginaInventario.obtenerTextoContadorCarrito()).isEqualTo(cantidad);
    }

    @Step("Verificar que el contador del carrito no es visible")
    public void verificarContadorCarritoNoVisible() {
        assertThat(paginaInventario.esContadorCarritoVisible()).isFalse();
    }

    @Step("Ordenar los productos por: {0}")
    public void ordenarProductosPor(String opcion) {
        paginaInventario.ordenarProductosPor(opcion);
    }

    @Step("Verificar que el primer producto es: {0}")
    public void verificarPrimerProducto(String nombreEsperado) {
        assertThat(paginaInventario.obtenerNombrePrimerProducto()).isEqualTo(nombreEsperado);
    }

    @Step("Verificar que el botón del producto {0} muestra: {1}")
    public void verificarBotonProducto(String nombreProducto, String textoEsperado) {
        assertThat(paginaInventario.obtenerTextoBotonProducto(nombreProducto)).isEqualTo(textoEsperado);
    }

    @Step("Click en el icono del carrito")
    public void clickEnIconoCarrito() {
        paginaInventario.clickIconoCarrito();
    }

    @Step("Verificar que estoy en la página del carrito")
    public void verificarPaginaCarrito() {
        assertThat(paginaInventario.esUrlPaginaCarrito()).isTrue();
    }

    @Step("Click en el menú hamburguesa")
    public void clickEnMenuHamburguesa() {
        paginaInventario.clickMenuHamburguesa();
    }

    @Step("Verificar que el menú lateral es visible")
    public void verificarMenuLateralVisible() {
        assertThat(paginaInventario.esMenuLateralVisible()).isTrue();
    }

    @Step("Click en la opción del menú: {0}")
    public void clickEnOpcionMenu(String opcion) {
        paginaInventario.clickOpcionMenuLateral(opcion);
    }

    @Step("Cerrar menú lateral")
    public void cerrarMenuLateral() {
        paginaInventario.cerrarMenuLateral();
    }

    @Step("Verificar que estoy en la página de login")
    public void verificarPaginaLogin() {
        assertThat(paginaInventario.esUrlPaginaLogin()).isTrue();
    }

    @Step("Verificar que el precio del producto {0} es: {1}")
    public void verificarPrecioProducto(String nombreProducto, String precioEsperado) {
        assertThat(paginaInventario.obtenerPrecioProducto(nombreProducto)).isEqualTo(precioEsperado);
    }

    @Step("Click en el producto: {0}")
    public void clickEnProducto(String nombreProducto) {
        paginaInventario.clickEnProductoPorNombre(nombreProducto);
    }

    @Step("Verificar que estoy en la página de detalle del producto")
    public void verificarPaginaDetalleProducto() {
        assertThat(paginaInventario.esUrlPaginaDetalleProducto()).isTrue();
    }
}

