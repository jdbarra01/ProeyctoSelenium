package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {

    private WebDriver driver;

    //*** Constructor
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //*** Enlace para obtener nuestro objetos
    @FindBy(how = How.NAME, using = "userName")
    WebElement txtUsuario;

    @FindBy(how = How.NAME, using = "password")
    WebElement txtlogin;

    @FindBy(how = How.NAME, using = "login")
    WebElement btloginn;

    //*** Metodos a probar
    public void ingresoCredenciales(String usr, String pass) {
        txtUsuario.sendKeys(usr);
        txtlogin.sendKeys(pass);
    }

    public void btnPass() {
        btloginn.click();
    }
}