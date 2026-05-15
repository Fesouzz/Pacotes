/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemadeusuarios.teste;

import br.edu.etec.sistemadeusuarios.model.NivelAcesso;
import br.edu.etec.sistemadeusuarios.model.Usuario;

/**
 *
 * @author fesil
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario us = new Usuario("Fagner", "000", NivelAcesso.ADMIN);
        us.info();
        us.autenticar("000");
        us.getNivel();

    }
    
}
