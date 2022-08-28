package mesa_14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicamentoTest {
    MedicamentoService medicamentoService;

    @BeforeEach
    public void carregarAntes()
    {
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfigurarJDBC()));
    }
    @Test
    public void testeSalvar()
    {
        Medicamento medicamento1 = new Medicamento("Ebuprofeno", "Generico", 30, 33.9f);
        medicamentoService.salvar(medicamento1);

        Medicamento medicamento2 = new Medicamento("Histamin", "Medley", 10, 14.9f);
        medicamentoService.salvar(medicamento2);
    }

    @Test
    public void testeBuscar()
    {
        Medicamento medicamento = medicamentoService.buscar(1);
        System.out.println(medicamento.toString());
    }
}
