/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.model;

/**
 *
 * @author fesil
 */
public class SMS extends Notificacao {
    
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    
    @Override
    public void Info(){
        System.out.print("-----Sistema de notificacao----");
        System.out.println("Destinatario: " + destinatario);
        System.out.print("Mensagem: " + mensagem );
        System.out.println(tipo);
    }
    
    @Override
     public void Enviar(){
        System.out.println("Mensagem enviada");
    }
}
