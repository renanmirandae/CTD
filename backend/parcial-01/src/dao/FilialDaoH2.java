package dao;

import model.Filial;
import org.apache.log4j.Logger;

import java.sql.*;

public class FilialDaoH2 implements IDao<Filial>{
    private static final Logger logger = Logger.getLogger(FilialDaoH2.class);
    private ConfigurarJDBC configurarJDBC;

    public FilialDaoH2(ConfigurarJDBC configurarJDBC) {
        this.configurarJDBC = configurarJDBC;
    }

    @Override
    public Filial salvar(Filial filial) {
        logger.info("Tentativa de insercao de uma nova filial");

        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("INSERT INTO FILIAL(NOME, RUA, NUMERO, CIDADE, ESTADO, CINCO_ESTRELA) VALUES ('%s','%s','%s','%s', '%s', '%s')",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.iseCincoEstrelas());
        try
        {
            logger.debug("Bloco try do metodo salvar");
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        }catch(SQLException e)
        {
            logger.error("Error ao salvar filial", e);
            e.printStackTrace();
        }
        return filial;
    }
}
