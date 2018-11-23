package br.com.svalgas.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

    private String nome;
    private  int idade;

    public Aluno(){

    }

    public Aluno(final String nome, final int idade) {
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
