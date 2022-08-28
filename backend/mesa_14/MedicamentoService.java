package mesa_14;

public class MedicamentoService {
    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    public Medicamento salvar(Medicamento medicamento){
        return medicamentoDao.salvar(medicamento);
    }

    public Medicamento buscar(Integer id){return medicamentoDao.buscar(id); }
}
