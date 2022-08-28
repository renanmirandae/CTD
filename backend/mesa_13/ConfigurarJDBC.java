package mesa_13;

import org.apache.log4j.Logger;

import java.sql.*;

public class ConfigurarJDBC {
    private String driver, url, usuario, senha;
    private static final String CREATE = "create table if not exists dentista(id int primary key auto_increment, nome varchar(30) not null, sobrenome varchar(30) not null, matricula varchar(15) not null);";
    private static final Logger log = Logger.getLogger(ConfigurarJDBC.class);

    public ConfigurarJDBC(String driver, String url, String usuario, String senha) {
        this.driver = driver;
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ConfigurarJDBC() {
        this.driver = "org.h2.Driver";
        this.url = "jdbc:h2:~/test";
        this.usuario = "sa";
        this.senha = "";
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
            statement.execute(CREATE);
            log.info("Conexao com o banco estabelecida");
        }catch(SQLException error)
        {
            error.printStackTrace();
            log.debug("Falha ao conectar com o banco.");
        }
        return connection;
    }
}
