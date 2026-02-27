package page;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://saucedemo.com")
public class SaucePage extends PageObject {

    private static final Config configuracion = ConfigFactory.load("serenity.conf");

    @FindBy(id = "user-name")
    WebElementFacade campoUsuario;

    @FindBy(id = "password")
    WebElementFacade campoContrasena;

    @FindBy(id = "login-button")
    WebElementFacade botonLogin;

    @FindBy(className = "app_logo")
    WebElementFacade logoSwagLabs;

    @FindBy(css = "h3[data-test='error']")
    WebElementFacade mensajeError;

    @FindBy(css = "button.error-button")
    WebElementFacade botonCerrarError;

    @FindBy(css = "span.title")
    WebElementFacade tituloProductos;

    public String obtenerUsuarioDesdeConfig(String tipoUsuario) {
        String clave = "credenciales.usuario." + tipoUsuario;
        return configuracion.getString(clave);
    }

    public String obtenerContrasenaDesdeConfig() {
        return configuracion.getString("credenciales.contrasena");
    }

    public void ingresarUsuario(String textoUsuario) {
        campoUsuario.type(textoUsuario);
    }

    public void ingresarContrasena(String textoContrasena) {
        campoContrasena.type(textoContrasena);
    }

    public void clickBotonLogin() {
        botonLogin.click();
    }

    public void verificarPaginaHome() {
        logoSwagLabs.waitUntilVisible();
        if (!logoSwagLabs.isDisplayed()) {
            throw new AssertionError("El logo de Swag Labs no se muestra en la página Home");
        }
    }

    public String obtenerMensajeError() {
        mensajeError.waitUntilVisible();
        return mensajeError.getText();
    }

    public boolean esMensajeErrorVisible() {
        return mensajeError.isCurrentlyVisible();
    }

    public void cerrarMensajeError() {
        botonCerrarError.click();
    }

    public boolean esTituloProductosVisible() {
        tituloProductos.waitUntilVisible();
        return tituloProductos.isDisplayed();
    }
}