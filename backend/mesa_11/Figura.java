package mesa_11;

public class Figura {
    private int id;
    private String tipo, cor;

    public Figura(int id, String tipo, String cor) {
        this.id = id;
        this.tipo = tipo;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
