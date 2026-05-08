/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.cadastrodeequipamentos.teste;

import br.edu.etec.equipamento.model.Computador;

/**
 *
 * @author Admin
 */
public class testeEquipamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Computador c1 = new Computador("Lenovo Ideapad", "Slim 3", "Intel 7");
       c1.exibirDados();
    }
    
}
