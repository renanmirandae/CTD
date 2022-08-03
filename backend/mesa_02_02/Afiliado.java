package mesa_02_02;

public class Afiliado extends Vendedor{
    private int pontoVendas;

    public Afiliado() {
        this.pontoVendas = 0;
    }

    public Afiliado(String nome) {
        super(nome);
    }

    public int getPontoVendas() {
        return pontoVendas;
    }

    private void setPontoVendas(int pontoVendas) {
        this.pontoVendas = pontoVendas;
    }

    @Override
    public int calcularPontos() {
        return getPontoVendas();
    }

    @Override
    public int vender() {
        setPontoVendas(getPontoVendas() + 15);
        return getPontoVendas();
    }

    @Override
    public String mostrarCategoria() {
        return super.mostrarCategoria();
    }
}
