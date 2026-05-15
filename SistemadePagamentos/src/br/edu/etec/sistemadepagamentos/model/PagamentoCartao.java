/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamentos.model;

/**
 *
 * @author fesil
 */
public class PagamentoCartao extends Pagamento{
    private String numCartao;

    public PagamentoCartao(Double valor, StatusPagamento status, String numCartao) {
        super(valor, status);
        this.numCartao = numCartao;
    }
    
    
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
   
    @Override
    public void processarPagamento() {
        
          
    }
    @Override
    public void ExibirStatus() {
        System.out.println("-- Sistema de pagamento ----");
        if (getValor() > 0) {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("Status do pagamento: " + status);
            System.out.println("Pagamento realizado" + "\n");

        } else {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("Pagamento nao realizado");
            System.out.println("Status do pagamento: " + status + "\n");
        }

    }

}
