package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfigurarJDBC {
    private String driver, url, usuario, senha;
    private static final String CREATE_TABLE = "create table if not exists filial(id int primary key auto_increment, nome varchar(50), rua varchar(50), numero int, cidade varchar(50), estado varchar(30), cinco_estrela int);";

    public ConfigurarJDBC(String driver, String url, String usuario, String senha) {
        this.driver = driver;
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ConfigurarJDBC() {
        //'
        setDriver("org.h2.Driver");
        setUrl("jdbc:h2:~/test");
        setUsuario("sa");
        setSenha("");
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
        Statement statement = null;

        try
        {
            connection = DriverManager.getConnection(getUrl(), getUsuario(), getSenha());
            statement = connection.createStatement();
            statement.execute(CREATE_TABLE);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return connection;
    }
}