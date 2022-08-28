package com.dh.dentista;

public class DentistaService {
    private IDao<Dentista> dentistaDao;

    public DentistaService(IDao<Dentista> dentistaDao) {
        this.dentistaDao = dentistaDao;
    }

    public Dentista cadastrarDentista(Dentista dentista){return this.dentistaDao.cadastrarDentista(dentista);}
    public Dentista atualizarDentista(Integer id, String matricula){return this.dentistaDao.atualizarDentista(id, matricula);}
    public Dentista consultarDentistas(){return this.dentistaDao.consultarDentistas();}
}
