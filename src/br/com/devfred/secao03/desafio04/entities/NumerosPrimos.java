package br.com.devfred.secao03.desafio04.entities;

public class NumerosPrimos {

    public void listarPrimos(int ultimoNumero) {
        for (int i = 2; i <= ultimoNumero; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

    public boolean verificarPrimalidade(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0 && numero != i) {
                return false;
            }
        }
        return true;
    }
}
