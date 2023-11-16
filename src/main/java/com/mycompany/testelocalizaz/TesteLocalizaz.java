package com.mycompany.testelocalizaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

public class TesteLocalizaz {
    // criando array de estados
    // 28 opcoes
    static String[][] estados = {
                {"Selecione um Estado", "", ""},
                {"Acre", "AC", "12"},
                {"Alagoas", "AL", "27"},
                {"Amapá", "AP", "16"},
                {"Amazonas", "AM", "13"},
                {"Bahia", "BA", "29"},
                {"Ceará", "CE", "23"},
                {"Distrito Federal", "DF", "53"},
                {"Espírito Santo", "ES", "32"},
                {"Goiás", "GO", "52"},
                {"Maranhão", "MA", "21"},
                {"Mato Grosso", "MT", "51"},
                {"Mato Grosso do Sul", "MS", "50"},
                {"Minas Gerais", "MG", "31"},
                {"Pará", "PA", "15"},
                {"Paraíba", "PB", "25"},
                {"Paraná", "PR", "41"},
                {"Pernambuco", "PE", "26"},
                {"Piauí", "PI", "22"},
                {"Rio Grande do Norte", "RN", "24"},
                {"Rio Grande do Sul", "RS", "43"},
                {"Rio de Janeiro", "RJ", "33"},
                {"Rondônia", "RO", "11"},
                {"Roraima", "RR", "14"},
                {"Santa Catarina", "SC", "42"},
                {"São Paulo", "SP", "35"},
                {"Sergipe", "SE", "28"},
                {"Tocantins", "TO", "17"}
        };
    public static void timeout() throws InterruptedException {
        Thread.sleep(1000);
    }
    
    public static void interacaoEstado(WebDriver driverParam) throws InterruptedException {
        
        // Encontrar o botão por ID < select > 
        WebElement botaoEstado = driverParam.findElement(By.id("estado_sb"));
        WebElement outputEstado = driverParam.findElement(By.id("ibge_estado_input"));
        botaoEstado.click();
        // Criar um objeto Select passando o elemento <select> como parâmetro
        Select selectEstado = new Select(botaoEstado);
        // Ou selecionar uma opção pelo índice
         //selectEstado.selectByIndex(0);
         for (int i = 1; i < estados.length; i++){
             selectEstado.selectByIndex(i);
             
             
             
             //String codigoIbgeEstado = outputEstado.getText();
//             for (String[] estado : estados) {
//             System.out.println("Nome: " + estado[0] + ", Sigla: " + estado[1] + ", Código IBGE: " + estado[2]);
//                if (codigoIbgeEstado == estado[2]){
//                    confirmaCodigo = true;
//                 }
//         }
             timeout();
         }
    }
    
    public static void main(String[] args) throws InterruptedException {
        // Caminho para o ChromeDriver (coloque o caminho correto)
        String chromedriverpath = "C:\\Users\\andre\\AppData\\Local\\Programs\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriverpath );

        // Inicializa o WebDriver
        WebDriver driver = new ChromeDriver();

        // Abre o Google
        driver.get("https://artdsl.github.io/LocaliZAZ.js/");
        
        interacaoEstado(driver);
        timeout();
        
        // Encerra o navegador
        driver.quit();
    }
}
