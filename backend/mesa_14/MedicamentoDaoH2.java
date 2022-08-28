package mesa_14;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private ConfigurarJDBC configurarJDBC;
    final static Logger logger = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));

    public MedicamentoDaoH2(ConfigurarJDBC configurarJDBC) {
        this.configurarJDBC = configurarJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        logger.info("Resgistrando um novo medicamento");
        Connection connection = configurarJDBC.conectarBanco();
        Statement statement = null;

        String query = String.format("insert into medicamento(nome, laboratorio_fabricante, quantidade, valor) values('%s', '%s', '%s', '%s');",
                medicamento.getNome(), medicamento.getLaboratorioFabricante(), medicamento.getQuantidade(), medicamento.getValor());

        try
        {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next())
            {
                medicamento.setId(keys.getByte(1));
                statement.close();
                connection.close();
            }


        }catch(SQLException e)
        {
            logger.error("Error ao registrar um novo medicamento");
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        logger.info("Buscando um medicamento pelo seu id");
        Connection connection = new ConfigurarJDBC().conectarBanco();
        Statement statement = null;

        String query = String.format("select * from medicamento where id='%s'", id);

        Medicamento medicamento = null;

        try{
            logger.debug("Bloco try do metodo buscar");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                logger.debug("Bloco while, dentro do bloco try");
                medicamento = new Medicamento(resultSet.getByte("id"),
                        resultSet.getString("nome"),resultSet.getString("laboratorio_fabricante"),
                        resultSet.getInt("quantidade"),resultSet.getFloat("valor"));
            }
            statement.close();


        }catch(SQLException throwables){
            logger.error("Não foi possivel buscar o medicamento pelo id;");
            throwables.printStackTrace();
        }
        return medicamento;
    }
}
