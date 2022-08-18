import dao.IDao;
import model.Filial;

public class FilialService {
    IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial){
        return filialIDao.salvar(filial);
    }
}
