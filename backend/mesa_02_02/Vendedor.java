package mesa_02_02;

public abstract class Vendedor {
    protected String categoria;
    protected String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public Vendedor()
    {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract int calcularPontos();
    public abstract int vender();

    public String recategorizar()
    {
        if(calcularPontos() < 20)
        {
            setCategoria("Novato");
            return "Novato";
        }else if(calcularPontos() >= 20 && calcularPontos() <= 30)
        {
            setCategoria("Aprendiz");
            return "Aprendiz";
        }else if(calcularPontos() > 30 && calcularPontos()<= 40)
        {
            setCategoria("Bom");
            return "Bom";
        }else {
            setCategoria("Mestre");
            return "Mestre";
        }
    }
    public String mostrarCategoria()
    {
        calcularPontos();
        recategorizar();
        return getCategoria();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", pontos='" + calcularPontos() + '\'' +
                '}';
    }
}
