package mesa_02_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Testes {

    //Classe para testes da aplicação

    Afiliado a1, a2, a3;
    Funcionario f1, f2, f3;

    @BeforeEach
    void instancia()
    {
        a1 = new Afiliado("Lucas");
        a2 = new Afiliado("Mario");
        a3 = new Afiliado("Luiza");

        f1 = new Funcionario(LocalDate.of(2011, 02, 15), "Maria");
        f2 = new Funcionario(LocalDate.of(2015, 05, 28), "Ivana");
        f3 = new Funcionario(LocalDate.of(2019, 12, 1), "Renan");

    }

    @Test
    void testeAfiliado()
    {
        //Teste 1
        a1.vender();
        a1.vender();
        Assertions.assertEquals(30,a1.calcularPontos());
        Assertions.assertEquals("Aprendiz",a1.mostrarCategoria());

        //Teste 2
        a2.vender();
        a2.vender();
        a2.vender();
        Assertions.assertEquals(45,a2.calcularPontos());
        Assertions.assertEquals("Mestre",a2.mostrarCategoria());

        //Teste 3
        a3.vender();
        Assertions.assertEquals(15,a3.calcularPontos());
        Assertions.assertEquals("Novato",a3.mostrarCategoria());

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }

    @Test
    void testeFuncionario()
    {
        // Teste 1
        f1.obterAfiliados();
        f1.vender();
        Assertions.assertEquals(70, f1.calcularPontos());
        Assertions.assertEquals("Mestre", f1.mostrarCategoria());

        //Teste 2
        f2.obterAfiliados();
        f2.obterAfiliados();
        f2.vender();
        Assertions.assertEquals(60, f2.calcularPontos());
        Assertions.assertEquals("Mestre", f2.mostrarCategoria());

        //Teste 3
        f3.vender();
        Assertions.assertEquals(20, f3.calcularPontos());
        Assertions.assertEquals("Aprendiz", f3.mostrarCategoria());

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}
