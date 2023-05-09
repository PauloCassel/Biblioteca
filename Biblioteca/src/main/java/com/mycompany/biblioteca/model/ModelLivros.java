/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Aluno TDS
 */
public class ModelLivros {
    private String autor;
    private String titulo;
    private String categoria;
    private String ano;
    private String indice;
    
    public ModelLivros(String titulo, String autor, String categoria, String ano, String indice) {
        this.autor = autor;
        this.titulo = titulo;
        this.categoria = categoria;
        this.ano = ano;
        this.indice = indice;
    }
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getIndice() {
        return indice;
    }
    public void setIndice(String indice) {
        this.indice = indice;
    }
}
