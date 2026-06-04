package br.com.devfred.secao02.desafio02.entities;

public class IdadePessoa {
    private String nome;
    private int idade;

    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade(int idade){
        if(idade >= 18){
            return true;
        }else{
            return false;
        }
    }
}
