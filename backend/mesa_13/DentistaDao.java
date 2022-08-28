package mesa_13;

import org.apache.log4j.Logger;

import java.sql.*;

public class DentistaDao implements IDao<Dentista>{
    private static final Logger log = Logger.getLogger(DentistaDao.class);
    private ConfigurarJDBC configurarJDBC;

    public DentistaDao(ConfigurarJDBC configurarJDBC) {
        this.configurarJDBC = configurarJDBC;
    }

    @Override
    public Dentista cadastrarDentista(Dentista dentista) {
        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;
        String query = String.format("insert into dentista(nome, sobrenome, matricula) values('%s', '%s', '%s')", dentista.getNome(), dentista.getSobrenome(), dentista.getMatricula());
        try
        {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            log.info("Inserindo um novo dentista no banco");

            if(keys.next())
            {
                dentista.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        }catch(SQLException error)
        {
            log.debug("Erro ao registrar um novo dentista");
            error.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Dentista atualizarDentista(Integer id, String matricula) {
        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;
        log.info("Atualizando dentista");
        String query = String.format("update dentista set matricula='%s' where id='%s'", matricula, id);

        try
        {
           statement = connection.createStatement();
           statement.executeUpdate(query);
           connection.close();
           statement.close();

        }catch(SQLException error)
        {
            error.printStackTrace();
            log.debug("Erro ao atualizar matricula do dentista.");
        }
        return null;
    }

    @Override
    public Dentista consultarDentistas() {
        log.info("Consultando dados do banco.");

        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;
        String query = "select * from dentista;";

        try
        {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
                log.debug("Bloco try do metodo consultarDentistas()");
                System.out.println("Id: " + resultSet.getInt(1) + " Nome: " + resultSet.getString("nome") +  " Sobrenome: " + resultSet.getString("sobrenome") +  " Matricula: " + resultSet.getString("matricula"));
            }
            statement.close();
        }catch(SQLException error)
        {
            error.printStackTrace();
            log.debug("Erro ao consultar dentistas");
        }
        return null;
    }
}
