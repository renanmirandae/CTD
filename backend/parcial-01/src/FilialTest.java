import dao.ConfigurarJDBC;
import dao.FilialDaoH2;
import model.Filial;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilialTest {
    FilialService filialService;

    @BeforeEach
    public void fazerAntes()
    {
        filialService = new FilialService(new FilialDaoH2(new ConfigurarJDBC()));
    }

    @Test
    public void salvarFilial()
    {
        Filial filial1 = new Filial(53, "Sao Luiz", "Direta", "Salvador", "Bahia", 1);
        filialService.salvar(filial1);

        Filial filial2 = new Filial(1052, "Araraquara", "Dom Pedro II", "Araraquara", "Sao Paulo", 0);
        filialService.salvar(filial2);

        Filial filial3 = new Filial(25, "Sao Felix", "R Nada a Declarar", "Sao Paulo", "Sao Paulo", 1);
        filialService.salvar(filial3);

        Filial filial4 = new Filial(35, "DH Brasil", "Napolao B", "Rio de Janeiro", "Rio de Janeiro", 0);
        filialService.salvar(filial4);

        Filial filial5 = new Filial(2568, "Salvador", "da França", "Salvador", "Bahia", 1);
        filialService.salvar(filial5);
    }
}
