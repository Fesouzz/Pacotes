/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadezoologico.model;

/**
 *
 * @author fesil
 */
public class Golfinho extends Animal{
     public Golfinho(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("O golfinho esta assoviando");
    }
}
