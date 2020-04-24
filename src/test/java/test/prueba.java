package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Home;

public class prueba {
    //*** Inicializa el driver para modo incognito ***
    WebDriver driver;
    //*** Ruta de nuestro Driver
    private String PATHDRIVER = "src/test/resources/drivers/";
    //*** Url del sitio que vamos automatizar ***
    private String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";

    //*** Declaracion de variables para ingreso al sitio ***
    private String usuario = "loncomil";
    private String pass = "loncomil01";


    //*** Iniciamos el Driver ***
    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get(baseURL);

    }

    //*** Se ejecuta nuestro Test***
    @Test
    public void singUp() {
        //*** Instancia de nuestra clase***
        Home home = new Home(driver);
        //Metodos a ejecutar de la clase Home ***
        home.ingresoCredenciales(usuario, pass);
        home.btnPass();
    }

    //*** Cerramos nuesto driver ***
    @After
    public void close() {
        driver.close();
    }
}
