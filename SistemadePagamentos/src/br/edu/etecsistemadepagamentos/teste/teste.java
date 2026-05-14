/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etecsistemadepagamentos.teste;

import br.edu.etec.sistemadepagamentos.model.Pagamento;
import br.edu.etec.sistemadepagamentos.model.PagamentoCartao;

/**
 *
 * @author fesil
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pagamento p1 = new PagamentoCartao(4.0, "0001235");
      Pagamento p2 = new PagamentoCartao(10.0, "8787879");
      p1.ExibirStatus();
      p1.processarPagamento();
      p1.ExibirStatus();
      
      p2.processarPagamento();
      p2.ExibirStatus();
    }
    
}
