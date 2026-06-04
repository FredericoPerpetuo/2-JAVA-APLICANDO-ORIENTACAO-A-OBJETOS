package br.com.devfred.secao03.desafio01;


import br.com.devfred.secao03.desafio01.entities.ModeloCarro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro md1 = new ModeloCarro ("Audi", 80000.00, 85000.00, 90000.00);
        ModeloCarro md2 = new ModeloCarro ("HB20", 75000.00, 78000.00, 80000.00);

        System.out.println(md1.toString());
        System.out.println(String.format("Menor preço: R$%.2f", md1.getMenorPreco()));
        System.out.println(String.format("Maior preço: R$%.2f", md1.getMaiorPreco()));
        System.out.println("----------------------------------------------------------");
        System.out.println(md2.toString());
        System.out.println(String.format("Menor preço: R$%.2f", md2.getMenorPreco()));
        System.out.println(String.format("Maior preço: R$%.2f", md2.getMaiorPreco()));
    }
}