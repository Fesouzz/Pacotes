/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.exCarro.model;

/**
 *
 * @author Admin
 */
public class Carro {
    private String nome;
    private String marca;
    private int ano;
    
    public Carro(String nome, String marca, int ano) {
        setNome(nome);
        setMarca(marca);
        setAno(ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void Info(){
    System.out.println("Nome: " + getNome());
    System.out.println("Marca: " + getMarca());
    System.out.println("Ano: " + getAno());
    }
}
