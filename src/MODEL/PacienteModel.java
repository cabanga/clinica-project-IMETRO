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
public class PacienteModel {
    private int id_paciente;
    private String nome;
    private String bilhete_identidade;
    private String morada;
    private int idade;
    private boolean was_paid;
    private int estado;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBilhete_identidade() {
        return bilhete_identidade;
    }

    public void setBilhete_identidade(String bilhete_identidade) {
        this.bilhete_identidade = bilhete_identidade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isWas_paid() {
        return was_paid;
    }

    public void setWas_paid(boolean was_paid) {
        this.was_paid = was_paid;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString (){
        return nome;
    }
    
}
