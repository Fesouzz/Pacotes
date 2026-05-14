/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemadezoologico.teste;

import br.edu.etec.sistemadezoologico.model.Animal;
import br.edu.etec.sistemadezoologico.model.Arara;
import br.edu.etec.sistemadezoologico.model.Golfinho;
import br.edu.etec.sistemadezoologico.model.Leao;

/**
 *
 * @author fesil
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal Leao = new Leao ("Djonga" , 11 , "Terrestre"); 
       Animal Golfinho = new Golfinho("Beenjamin",30 , "Aquatico");
       Animal Arara = new Arara("Jade", 5 , "Aereo");
       
       Leao.info();
       Leao.emitirSom();
       
       Golfinho.info();
       Golfinho.emitirSom();
       
       Arara.info();
       Arara.emitirSom();
       
    }
    
}
