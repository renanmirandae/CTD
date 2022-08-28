package org.example;

import com.dh.paciente.jdbc.ConfigurarJDBC;
import org.junit.jupiter.api.Test;

public class PacienteTest {
    @Test
    void conectar()
    {
        ConfigurarJDBC configurarJDBC = new ConfigurarJDBC();
        configurarJDBC.conectarBanco();
    }
}
