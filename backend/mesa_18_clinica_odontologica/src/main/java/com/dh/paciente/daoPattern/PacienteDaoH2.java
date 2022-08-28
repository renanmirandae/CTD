package com.dh.paciente.daoPattern;

import com.dh.paciente.Paciente;
import com.dh.paciente.jdbc.ConfigurarJDBC;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDaoH2 implements IDao<Paciente>{
    private ConfigurarJDBC configurarJDBC;
    private static Logger log = Logger.getLogger(String.valueOf(PacienteDaoH2.class));

    public PacienteDaoH2(ConfigurarJDBC configurarJDBC) {
        this.configurarJDBC = configurarJDBC;
    }

    @Override
    public Paciente cadastrar(Paciente paciente) {
        log.info("Cadastrando um novo paciente");
        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;

        String queryCadastro = String.format("insert into cadastro(nome, sobrenome, rg, data_cadastro) values('%s','%s','%s','%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getDataCadastro());

        try
        {
            statement = connection.createStatement();
            statement.executeUpdate(queryCadastro, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next())
            {
                paciente.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e)
        {
            log.error("Erro ao cadastrar um novo paciente", e);
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        return null;
    }

    @Override
    public Paciente excluir(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente atualizar(Paciente paciente) {
        return null;
    }
}
