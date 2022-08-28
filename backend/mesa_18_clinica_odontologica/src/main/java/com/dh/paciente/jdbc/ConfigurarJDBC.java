package com.dh.paciente.jdbc;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurarJDBC {
    private String driver, url, usuario, senha;
    private static Logger log = Logger.getLogger(ConfigurarJDBC.class);

    public ConfigurarJDBC(String driver, String url, String usuario, String senha) {
        this.driver = driver;
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ConfigurarJDBC() {
        this.driver = "org.h2.Driver";
        this.url = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'C:/Aprendizado/CTD/dh/quartoBimestre/src/mesa_15/create_banco.sql'";
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
        log.info("Conectando ao banco de dados");
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(getUrl(), getUsuario(), getSenha());
        }catch(SQLException e)
        {
            log.error("Erro ao conectar o banco de dados", e);
            e.printStackTrace();
        }
        return connection;
    }
}
