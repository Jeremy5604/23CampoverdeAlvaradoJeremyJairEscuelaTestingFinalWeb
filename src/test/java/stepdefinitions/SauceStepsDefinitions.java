package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.SauceSteps;

public class SauceStepsDefinitions {

    @Steps
    SauceSteps pasosSauce;

    @Dado("que el usuario abre la página de SauceDemo")
    public void abrirSauceDemo() {
        pasosSauce.abrirSauceDemo();
    }

    @Cuando("escribo el usuario {string}")
    public void escriboElUsuario(String tipoUsuario) {
        pasosSauce.escribirUsuarioPorTipo(tipoUsuario);
    }

    @Y("escribo la contraseña válida")
    public void escriboLaContrasenaValida() {
        pasosSauce.escribirContrasenaValida();
    }

    @Cuando("escribo un usuario inexistente {string}")
    public void escriboUnUsuarioInexistente(String usuario) {
        pasosSauce.escribirUsuarioDirecto(usuario);
    }

    @Y("escribo una contraseña incorrecta {string}")
    public void escriboUnaContrasenaIncorrecta(String contrasena) {
        pasosSauce.escribirContrasenaIncorrecta(contrasena);
    }

    @Y("hago click en el botón Login")
    public void clickEnElBotonLogin() {
        pasosSauce.clickEnElBotonLogin();
    }

    @Entonces("carga pagina home mostrando el logo")
    public void cargaPaginaHomeMostrandoElLogo() {
        pasosSauce.verificarPaginaHome();
    }

    @Entonces("se muestra el mensaje de error {string}")
    public void seMuestraElMensajeDeError(String mensajeEsperado) {
        pasosSauce.verificarMensajeDeError(mensajeEsperado);
    }

    @Cuando("cierro el mensaje de error")
    public void cierroElMensajeDeError() {
        pasosSauce.cerrarMensajeDeError();
    }

    @Entonces("el mensaje de error no es visible")
    public void elMensajeDeErrorNoEsVisible() {
        pasosSauce.verificarMensajeDeErrorNoVisible();
    }

    @Y("el título de la página de productos es visible")
    public void elTituloDeLaPaginaDeProductosEsVisible() {
        pasosSauce.verificarTituloProductosVisible();
    }
}