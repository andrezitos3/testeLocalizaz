/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testelocalizaz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author andre
 */
public class TesteAceitacao extends TesteLocalizazTest {
    
    static         // criando array de estados (variavel original)
        // 28 opcoes
        String[][] estados = {
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
    
    @Test
    public void testarEstados() throws InterruptedException{
        
        // Navegar para a página com o seu select
        driver.get("https://artdsl.github.io/LocaliZAZ.js/");

        // Encontrar o elemento select
        WebElement botaoEstado = driver.findElement(By.id("estado_sb"));
        WebElement inputEstado = driver.findElement(By.id("ibge_estado_input"));
        
        // Criar um objeto Select a partir do elemento (botaoEstado)
        Select selectEstado = new Select(botaoEstado);
        
        // contador para acessar os index
        int contador = 0;
        
        // Obter todas as opções e imprimir seus textos
        for (WebElement option : selectEstado.getOptions()) {
            selectEstado.selectByIndex(contador);
            // Pegar o conteúdo do elemento de entrada
            String codigoIbgeEstado = inputEstado.getAttribute("value");
            System.out.println("Estado: " + option.getText());
            System.out.println("Codigo IBGE: " + codigoIbgeEstado);
            assertEquals(estados[contador][0], option.getText());
            assertEquals(estados[contador][2], codigoIbgeEstado);
            contador++;
            timeout();
            }
        }
}
