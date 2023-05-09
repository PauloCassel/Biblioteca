/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Aluno TDS
 */
public class ModelAutor {
    private String nomeA;
    private String cpfA;
    private String telefoneA;
    
    public ModelAutor(String nomeA, String cpfA, String telefoneA) {
        this.nomeA = nomeA;
        this.cpfA = cpfA;
        this.telefoneA = telefoneA;
    }
    public String getNomeA() {
        return nomeA;
    }
    
    public void setNomeA(String nome) {
        this.nomeA = nomeA;
    }
    public String getCPFA() {
        return cpfA;
    }
    public void setCPFA(String cpf) {
        this.cpfA = cpfA;
    }
    public String getTelefoneA() {
        return telefoneA;
    }
    public void setTelefoneA(String telefone) {
        this.telefoneA = telefoneA;
    }
}
