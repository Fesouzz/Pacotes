/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadeusuarios.model;

/**
 *
 * @author fesil
 */
public class Usuario {
    private String login;
    private String senha; 
    private NivelAcesso nivel; 
    private boolean ativo = true; 
    
    
    public Usuario(String login, String senha, NivelAcesso nivel) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }
    
    public void autenticar(String senha){
        if (senha.equals(this.senha) && ativo == true){
            System.out.println("Entrada autorizada");
           
        }else{
            System.out.println("Sua senha esta incorreta ou seu usuario esta inativo");
        } 
    }
    public void deseativar(){
        ativo = false; 
        System.out.println("Usuario inativo");
    }
    
    
     public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }
    public void info(){
        System.out.println("Nome do usuario: " + getLogin());
        System.out.println("Nivel de acesso: " + getNivel()); 
    }

}
