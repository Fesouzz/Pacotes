/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.teste;

import br.edu.etec.sistemadenotificacao.model.Email;
import br.edu.etec.sistemadenotificacao.model.Notificacao;
import br.edu.etec.sistemadenotificacao.model.SMS;
import br.edu.etec.sistemadenotificacao.model.TipoNotificacao;

/**
 *
 * @author fesil
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificacao Email = new Email("Carina", "oi gente", TipoNotificacao.EMAIL); 
        Notificacao SMS = new SMS("Bru","oii", TipoNotificacao.SMS);
        
        Email.Info();
        Email.Enviar();
        SMS.Info();
        SMS.Enviar();
    }
    
}
