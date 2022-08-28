package mesa_14;

public class Medicamento {
    private byte id;
    private String nome, laboratorioFabricante;
    private int quantidade;
    private Float valor;

    public Medicamento(byte id, String nome, String laboratorioFabricante, int quantidade, Float valor) {
        this.id = id;
        this.nome = nome;
        this.laboratorioFabricante = laboratorioFabricante;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Medicamento(String nome, String laboratorioFabricante, int quantidade, Float valor) {
        this.nome = nome;
        this.laboratorioFabricante = laboratorioFabricante;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Medicamento() {
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorioFabricante() {
        return laboratorioFabricante;
    }

    public void setLaboratorioFabricante(String laboratorioFabricante) {
        this.laboratorioFabricante = laboratorioFabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", laboratorioFabricante='" + laboratorioFabricante + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
