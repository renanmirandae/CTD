package mesa_02_02;

public class Estagiario extends Vendedor{
    private int pontos;
    private String categoria;

    public Estagiario(String nome) {
        super(nome);
        this.pontos = 0;
    }

    public int getPontos() {
        return pontos;
    }

    private void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String recategorizar() {
        if(getPontos() < 50)
        {
            return "estagiario novato";
        }else {
            return "estagiario experiente";
        }
    }

    @Override
    public String mostrarCategoria() {
        calcularPontos();
        setCategoria(recategorizar());
        return getCategoria();
    }

    @Override
    public int calcularPontos() {
        return getPontos();
    }

    @Override
    public int vender() {
        setPontos(getPontos() + 5);
        return getPontos();
    }
}
