package mesa_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testes {

    // Executando testes nas classes Circulo e Quadrado

    Circulo c1, c2, c3;
    Quadrado q1, q2, q3;

    @BeforeEach
    void fazerAntes()
    {
        //Instanciando objetos da classe circulo
        c1 = new Circulo(3);
        c2 = new Circulo(5);
        c3 = new Circulo(2);

        //Instanciando objetos da classe quadrado
        q1 = new Quadrado(3);
        q2 = new Quadrado(7);
        q3 = new Quadrado(4);
    }

    @Test
    void testeCirculo()
    {
        Assertions.assertEquals(18.84955592153876, c1.calcularPerimetro());
        Assertions.assertEquals(31.41592653589793, c2.calcularPerimetro());
        Assertions.assertEquals(12.566370614359172, c3.calcularPerimetro());
    }

    @Test
    void testeQuadrado(){
        Assertions.assertEquals(12, q1.calcularPerimetro());
        Assertions.assertEquals(28, q2.calcularPerimetro());
        Assertions.assertEquals(16, q3.calcularPerimetro());
    }

}
