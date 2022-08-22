package aula_19;

import java.io.Serializable;

public class Cao implements Serializable {
    private String nome;
    private byte idade;

    public Cao(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
