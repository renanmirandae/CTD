package mesa_02_02;

import java.time.LocalDate;

public class Funcionario extends Vendedor{

    private int pontosAfiliados, pontosVendas;
    private LocalDate dataAdmissao;

    public Funcionario(LocalDate dataAdmissao) {
        setPontosVendas(0);
        setPontosAfiliados(0);
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(LocalDate dataAdmissao, String nome) {
        super(nome);
        setPontosVendas(0);
        setPontosAfiliados(0);
        this.dataAdmissao = dataAdmissao;
    }

    public int getPontosAfiliados() {
        return pontosAfiliados;
    }

    private void setPontosAfiliados(int pontosAfiliados) {
        this.pontosAfiliados = pontosAfiliados;
    }

    public int getPontosVendas() {
        return pontosVendas;
    }

    private void setPontosVendas(int pontosVendas) {
        this.pontosVendas = pontosVendas;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    private void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int obterAfiliados()
    {
        setPontosAfiliados(getPontosAfiliados() + 10);
        return getPontosAfiliados();
    }

    @Override
    public int calcularPontos() {
        int antiguidade = 2022 - getDataAdmissao().getYear();
        return getPontosVendas() + getPontosAfiliados() + (antiguidade * 5);
    }

    @Override
    public int vender()
    {
        setPontosVendas(getPontosVendas() + 5);
        return getPontosVendas();
    }
}
