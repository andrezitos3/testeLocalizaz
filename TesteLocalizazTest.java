/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testelocalizaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

/**
 *
 * @author andre
 */
public class TesteLocalizazTest {
    
    protected static WebDriver driver;
    
    public static void timeout() throws InterruptedException{
        Thread.sleep(1000);
    }
    
    // configurações do driver
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\AppData\\Local\\Programs\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
     @Before
    public void setUp() {
        driver.get("https://artdsl.github.io/LocaliZAZ.js/");
    }
    
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
