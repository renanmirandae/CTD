package mesa_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfigurarJDBC {
    private String driver, url, usuario, senha;
    private static final String CREATE = "create table if not exists medicamento(id int primary key auto_increment, nome varchar(100), laboratorio_fabricante varchar(100), quantidade int, valor float);";

    public ConfigurarJDBC(String driver, String url, String usuario, String senha) {
        this.driver = driver;
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ConfigurarJDBC() {
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection conectarBanco()
    {
        Connection connection = null;
        Statement statement;
        try
        {
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            statement = connection.createStatement();
            statement.execute(CREATE);

        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return connection;
    }
}
