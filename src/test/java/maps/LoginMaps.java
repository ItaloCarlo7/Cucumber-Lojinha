package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {

    @FindBy(id="usuario")
    protected WebElement inpLogin;

    @FindBy(id="senha")
    protected WebElement inpsenha;

    @FindBy(id="btn-entrar")
    protected WebElement btnEntrar;

    @FindBy(id="nav-mobile")
    protected WebElement linkBoasVindas;



}
