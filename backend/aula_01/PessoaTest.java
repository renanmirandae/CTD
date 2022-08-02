package aula_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    public void fazerAntes()
    {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,8,15));

        p2 = new Pessoa("Marcos", "Mascarenhas");
        p2.setIdade(LocalDate.of(1995,8,21));

        p3 = new Pessoa("Lucas", "Sanatana");
        p3.setIdade(LocalDate.of(1980,5,11));

        p4 = new Pessoa("Luan", "Souza");
        p4.setIdade(LocalDate.of(2002,4,21));

        p5 = new Pessoa("Luiza", "Oliveira");
        p5.setIdade(LocalDate.of(2001,7,23));

        p6 = new Pessoa("Lais", "Souza");
        p6.setIdade(LocalDate.of(1991,8,10));

        p7 = new Pessoa("Ivanildes", "Miranda");
        p7.setIdade(LocalDate.of(1995,2,28));

        p8 = new Pessoa("Renata", "Bittencourt");
        p8.setIdade(LocalDate.of(2003,3,30));

        p9 = new Pessoa("Daniele", "Souza");
        p9.setIdade(LocalDate.of(2016,8,22));

        p10 = new Pessoa("Caio", "Kaiaque");
        p10.setIdade(LocalDate.of(2011,12,25));

    }

    @Test
    public void imprimirObjetos()
    {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    public void adicionarColecao()
    {
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }
}
