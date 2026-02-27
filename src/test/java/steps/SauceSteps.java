package steps;

import net.serenitybdd.annotations.Step;
import page.SaucePage;

import static org.assertj.core.api.Assertions.assertThat;

public class SauceSteps {

    SaucePage paginaLogin;

    @Step("Abrir la página de SauceDemo")
    public void abrirSauceDemo() {
        paginaLogin.open();
    }

    @Step("Escribir el usuario por tipo: {0}")
    public void escribirUsuarioPorTipo(String tipoUsuario) {
        String usuario = paginaLogin.obtenerUsuarioDesdeConfig(tipoUsuario);
        paginaLogin.ingresarUsuario(usuario);
    }

    @Step("Escribir un usuario directo: {0}")
    public void escribirUsuarioDirecto(String usuario) {
        paginaLogin.ingresarUsuario(usuario);
    }

    @Step("Escribir la contraseña válida desde configuración")
    public void escribirContrasenaValida() {
        String contrasena = paginaLogin.obtenerContrasenaDesdeConfig();
        paginaLogin.ingresarContrasena(contrasena);
    }

    @Step("Escribir una contraseña incorrecta: {0}")
    public void escribirContrasenaIncorrecta(String contrasena) {
        paginaLogin.ingresarContrasena(contrasena);
    }

    @Step("Click en el botón Login")
    public void clickEnElBotonLogin() {
        paginaLogin.clickBotonLogin();
    }

    @Step("Verificar que carga la página Home mostrando el logo")
    public void verificarPaginaHome() {
        paginaLogin.verificarPaginaHome();
    }

    @Step("Verificar que se muestra el mensaje de error: {0}")
    public void verificarMensajeDeError(String mensajeEsperado) {
        String mensajeActual = paginaLogin.obtenerMensajeError();
        assertThat(mensajeActual).isEqualTo(mensajeEsperado);
    }

    @Step("Cerrar el mensaje de error")
    public void cerrarMensajeDeError() {
        paginaLogin.cerrarMensajeError();
    }

    @Step("Verificar que el mensaje de error no es visible")
    public void verificarMensajeDeErrorNoVisible() {
        assertThat(paginaLogin.esMensajeErrorVisible()).isFalse();
    }

    @Step("Verificar que el título de la página de productos es visible")
    public void verificarTituloProductosVisible() {
        assertThat(paginaLogin.esTituloProductosVisible()).isTrue();
    }
}