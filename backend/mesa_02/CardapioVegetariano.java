package mesa_02;

public class CardapioVegetariano extends Empresa{

    private float valorCardapioVegetariano;
    private float valorEmbalagem;
    private float sobretaxa;

    public CardapioVegetariano(float valorCardapioVegetariano, float valorEmbalagem, float sobretaxa) {
        this.valorCardapioVegetariano = valorCardapioVegetariano;
        this.valorEmbalagem = valorEmbalagem;
        this.sobretaxa = sobretaxa;
    }

    public float getValorCardapioVegetariano() {
        return valorCardapioVegetariano;
    }

    public void setValorCardapioVegetariano(float valorCardapioVegetariano) {
        this.valorCardapioVegetariano = valorCardapioVegetariano;
    }

    public float getValorEmbalagem() {
        return valorEmbalagem;
    }

    public void setValorEmbalagem(float valorEmbalagem) {
        this.valorEmbalagem = valorEmbalagem;
    }

    public float getSobretaxa() {
        return sobretaxa;
    }

    public void setSobretaxa(float sobretaxa) {
        this.sobretaxa = sobretaxa;
    }

    @Override
    public void montagem() {
        System.out.println("Cardapio Vegetariano:\n-Pegar embalagem vegetariana\n-Inserir alimentos\n-Adicionar temperos\n-Fechar");
    }

    @Override
    public float calculoCusto() {
        float condimentos = getValorCardapioVegetariano() * (getSobretaxa() / 100);
        return getValorCardapioVegetariano() + getValorEmbalagem() + condimentos;
    }
}
