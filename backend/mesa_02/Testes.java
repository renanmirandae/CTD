package mesa_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testes {

    //Essa classe implementa alguns testes para a aplicação

    CardapioAdulto cardapioAdulto;
    CardapioInfantil cardapioInfantil;
    CardapioVegetariano cardapioVegetariano;

    @BeforeEach
    void instancias()
    {
        cardapioAdulto = new CardapioAdulto(25.99f);
        cardapioInfantil = new CardapioInfantil(22.99f, 5.99f);
        cardapioVegetariano = new CardapioVegetariano(32.99f, 7.95f, 1);
    }

    @Test
    void testeCardapioAdulto()
    {
        cardapioAdulto.montagem();
        System.out.println("Valor final R$" + cardapioAdulto.calculoCusto());
    }

    @Test
    void testeCardapioInfantil()
    {
        Assertions.assertEquals(28.98f, cardapioInfantil.calculoCusto());
        cardapioInfantil.montagem();
        System.out.println("Valor final R$" + cardapioInfantil.calculoCusto());
    }

    @Test
    void testeCardapioVegetariano()
    {
        Assertions.assertEquals(41.2699f, cardapioVegetariano.calculoCusto());
        cardapioVegetariano.montagem();
        System.out.println("Valor final R$" + cardapioVegetariano.calculoCusto());
    }
}
