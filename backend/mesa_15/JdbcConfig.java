package mesa_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    private String driver, url, nomeUsuario, senhaUsuario;
    private Connection conexao;

    public JdbcConfig(String driver, String url, String nomeUsuario, String senhaUsuario) {
        this.driver = driver;
        this.url = url;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public JdbcConfig() {
        this.driver = "org.h2.Driver";
        this.url = "jdbc:h2:~/test2;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senhaUsuario = "";
    }

    public Connection conectarDb()
    {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(url, nomeUsuario, senhaUsuario);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return conexao;
    }
}
