package mesa_11;

import java.sql.*;

public class BancoDados {
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    private static final String CREATE_TABLE = "DROP TABLE IF EXISTS FIGURA; CREATE TABLE FIGURA(ID INT PRIMARY KEY, TIPO VARCHAR(8) NOT NULL, COR VARCHAR(20) NOT NULL);";
    private static final String INSERT_FIGURA = "INSERT INTO FIGURA VALUES(?, ?, ?)";
    private static final String SELECT_ALL = "SELECT * FROM FIGURA";
    public void criarTabela()
    {
        try {
            statement = connection.createStatement();
            statement.execute(CREATE_TABLE);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws Exception
    {
        Class.forName("org.h2.Driver");
        connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        return connection;
    }

    public void inserirFigura(int id, String tipo, String cor) throws Exception {
        try
        {
            preparedStatement = connection.prepareStatement(INSERT_FIGURA);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, tipo);
            preparedStatement.setString(3, cor);
            preparedStatement.execute();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void exibirConsulta() throws Exception {
        ResultSet resultSet = statement.executeQuery(SELECT_ALL);

        while(resultSet.next())
        {
            System.out.println("ID: " + resultSet.getInt(1) + "| FIGURA: " + resultSet.getString(2) + "| COR: " + resultSet.getString(3));
        }

        connection.close();
    }
}
