package aula_01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome, sobrenome;
    private LocalDate idade;
    List<String> colecao = new ArrayList<String>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public int idade()
    {
        int idade = Period.between(this.idade, LocalDate.of(2022, 8, 1)).getYears();
        return idade;
    }

    public List<String> adicionarNomes(Pessoa p)
    {
        int var = p.getNome().length();
        int idade = p.idade();

        if(var>=5 && idade >=18)
        {
            colecao.add(getNome());
            System.out.println(colecao);
        }

        return null;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
