/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemadezoologico.teste;
 

import br.edu.etec.sistemadezoologico.model.Animal;
import br.edu.etec.sistemadezoologico.model.Arara;
import br.edu.etec.sistemadezoologico.model.Golfinho;
import br.edu.etec.sistemadezoologico.model.Habitat;
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
       Animal leao = new Leao ("Djonga" , 11 , Habitat.Terrestre ); 
       Animal golfinho = new Golfinho("Beenjamin",30 , Habitat.Aquatico);
       Animal arara = new Arara("Jade", 5 , Habitat.Aereo);
       
       leao.Info();
       leao.emitirSom();
       
       golfinho.Info();
       golfinho.emitirSom();
       
       arara.Info();
       arara.emitirSom();
       
    }
    
}
