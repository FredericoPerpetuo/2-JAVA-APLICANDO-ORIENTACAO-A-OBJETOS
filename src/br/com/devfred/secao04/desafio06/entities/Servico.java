package br.com.devfred.secao04.desafio06.entities;

import br.com.devfred.secao04.desafio06.interfaces.Vendavel;

import java.math.BigDecimal;

public class Servico implements Vendavel {
    public String nome;
    public BigDecimal vlrHora;

    public Servico(String nome, BigDecimal vlrHora)  {
        this.nome = nome;
        this.vlrHora = vlrHora;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getVlrHora() {
        return vlrHora;
    }

    @Override
    public BigDecimal caculaPrecoPorQuantidade(int qtd) {
        BigDecimal quantidade = new BigDecimal(qtd);
        return quantidade.multiply(vlrHora);
    }

    @Override
    public void aplicarDesconto(double percentualDescont) {
        vlrHora = vlrHora.subtract(vlrHora.multiply(new BigDecimal(percentualDescont)).divide(new BigDecimal("100.0")));
    }
}
