package com.dh.paciente;

import com.dh.paciente.daoPattern.IDao;

public class PacienteService {
    private IDao<Paciente> pacienteDao;

    public PacienteService(IDao<Paciente> pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public Paciente cadastrar(Paciente paciente)
    {
        return pacienteDao.cadastrar(paciente);
    }
}
