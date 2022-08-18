package model;

public class Filial {
    private int id, numero;
    private String nomeFilial, rua, cidade, estado;
    private int eCincoEstrelas;

    public Filial() {
    }

    public Filial(int id, int numero, String nomeFilial, String rua, String cidade, String estado, int eCincoEstrelas) {
        this.id = id;
        this.numero = numero;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public Filial(int numero, String nomeFilial, String rua, String cidade, String estado, int eCincoEstrelas) {
        this.numero = numero;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int iseCincoEstrelas() {
        return eCincoEstrelas;
    }

    public void seteCincoEstrelas(int eCincoEstrelas) {
        this.eCincoEstrelas = eCincoEstrelas;
    }
}
