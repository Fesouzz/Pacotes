/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamentos.model;

/**
 *
 * @author fesil
 */
public abstract class Pagamento {
    private double valor;
    StatusPagamento status;

    public Pagamento(Double valor) {
        this.valor = valor; 
        this.status = StatusPagamento.PENDENTE;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
        }
    }

    public abstract void processarPagamento();

    public void ExibirStatus() {
            System.out.println("Status do pagamento: " + status);
       
    }
    
}
