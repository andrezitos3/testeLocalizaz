/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testelocalizaz;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author andre
 */
class ViaCEPResponse {
    
    public ViaCEPResponse() {
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    @JsonProperty("ibge")
    private String ibge;
    
    @JsonProperty("uf")
    private String uf;

    @JsonProperty("localidade")
    private String localidade;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("logradouro")
    private String logradouro;
    
    public String getIbge() {
        return ibge;
    }
    
    public String getUf() {
        return uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }
}
