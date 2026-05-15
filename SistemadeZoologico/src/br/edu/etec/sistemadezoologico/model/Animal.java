/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadezoologico.model;

/**
 *
 * @author fesil
 */
public abstract class Animal {
    private String nome;
    private int idade;
    private Habitat habitat;

    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        setIdade(idade);
        this.habitat = habitat;

    }
    
    
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {

            this.idade = 0;

        } else {
            this.idade = idade;
        }
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
       
    public void Info(){
        System.out.println("---Sistema de Zoologico---");
        System.out.println("Nome :" + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habitat: " + getHabitat()); 
    }
    public abstract void emitirSom();
   
}
