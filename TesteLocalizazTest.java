package com.mycompany.testelocalizaz;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.BeforeClass;

public class TesteLocalizazTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pichau\\Documents\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Before
    public void setUp() {
         // Navegar para a página com o seu select
        driver.get("https://artdsl.github.io/LocaliZAZ.js/");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    public static void timeout() throws InterruptedException{
        Thread.sleep(1000);
    }
}
