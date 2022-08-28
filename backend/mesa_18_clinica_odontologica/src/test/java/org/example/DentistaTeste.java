package org.example;

import com.dh.dentista.ConfigurarJDBC;
import com.dh.dentista.Dentista;
import com.dh.dentista.DentistaDao;
import com.dh.dentista.DentistaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DentistaTeste {
    Dentista marlon, luiza, camila;
    DentistaService dentistaService;

    @BeforeEach
    public void carregarDados()
    {
        dentistaService = new DentistaService(new DentistaDao(new ConfigurarJDBC()));
        marlon = new Dentista("Silva", "Marlon", "8548458");
        luiza = new Dentista("Bittencourt", "Luiza", "5151651");
        camila = new Dentista("Moreira", "Camila", "458525");
    }

    @Test
    public void testeCadastrarDentista()
    {
        //Adicionando os dados no h2
        dentistaService.cadastrarDentista(marlon);
        dentistaService.cadastrarDentista(luiza);
        dentistaService.cadastrarDentista(camila);

        //Consultando os dados existentes no banco
        dentistaService.consultarDentistas();
    }

    public void testeConsultarDentista()
    {
        //Atualizando dados no banco
        marlon.setMatricula("4569999000");
        dentistaService.atualizarDentista(17, "4569999000");
    }
}
