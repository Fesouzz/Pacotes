/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etecsistemadepagamentos.teste;

import br.edu.etec.sistemadepagamentos.model.Pagamento;
import br.edu.etec.sistemadepagamentos.model.PagamentoCartao;
import br.edu.etec.sistemadepagamentos.model.StatusPagamento;

/**
 *
 * @author fesil
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pagamento p1 = new PagamentoCartao(4.0, StatusPagamento.PROCESSANDO, "0565232");
      Pagamento p2 = new PagamentoCartao(10.0, StatusPagamento.FALHA,"7723437");
      p1.ExibirStatus();
      p1.processarPagamento();
      p1.setStatus(StatusPagamento.CONCLUIDO);
      p1.ExibirStatus();
      
      p2.processarPagamento();
      p2.ExibirStatus();
    }
    
}
