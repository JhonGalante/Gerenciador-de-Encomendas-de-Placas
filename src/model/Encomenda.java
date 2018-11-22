/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jhona
 */
public class Encomenda {
    
    private Double altura;
    private Double largura;
    private String fraseEscrita;
    private CorPlaca corPlaca;
    private CorFrase corFrase;
    private LocalDate dataEntrega;
    private Double valorServico;
    private Double valorSinal;
    
    public Encomenda(){
        this.altura = 0.0;
        this.largura = 0.0;
        this.fraseEscrita = "";
        this.dataEntrega = LocalDate.parse("01/01/2000", DateTimeFormatter.ISO_DATE);
        this.valorServico = 0.0;
        this.valorSinal = 0.0;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public String getFraseEscrita() {
        return fraseEscrita;
    }

    public void setFraseEscrita(String fraseEscrita) {
        this.fraseEscrita = fraseEscrita;
    }

    public CorPlaca getCorPlaca() {
        return corPlaca;
    }

    public void setCorPlaca(CorPlaca corPlaca) {
        this.corPlaca = corPlaca;
    }

    public CorFrase getCorFrase() {
        return corFrase;
    }

    public void setCorFrase(CorFrase corFrase) {
        this.corFrase = corFrase;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getValorSinal() {
        return valorSinal;
    }

    public void setValorSinal(Double valorSinal) {
        this.valorSinal = valorSinal;
    }
    
    
    
}
