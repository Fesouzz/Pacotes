/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.model;

/**
 *
 * @author fesil
 */
public abstract class Notificacao {
    String destinatario;
    String mensagem; 
    TipoNotificacao tipo;
   
    
    public Notificacao(String destinatario,String mensagem, TipoNotificacao tipo){
        this.destinatario = destinatario;
        this.mensagem = mensagem; 
        this.tipo = tipo;
        
    }
    
    public void Info(){
        System.out.print("-----Sistema de notificacao----");
        System.out.println("Destinatario: " + destinatario);
        System.out.print("Mensagem: " + mensagem );
        System.out.println(tipo);
       
    }
    
    public TipoNotificacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacao tipo) {
        this.tipo = tipo;
    }
     
    public void Enviar(){
        System.out.println("Mensagem enviada");
    }
}
