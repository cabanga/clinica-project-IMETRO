/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author joao.c
 */
public class RastreioModel {
    private int id_rastreio;
    private int temperatura;
    private int peso;
    private int pressao;
    private String estado;
    private int id_paciente;

    public int getId_rastreio() {
        return id_rastreio;
    }

    public void setId_rastreio(int id_rastreio) {
        this.id_rastreio = id_rastreio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
}
