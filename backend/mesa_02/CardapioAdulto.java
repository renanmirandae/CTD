package mesa_02;

public class CardapioAdulto extends Empresa {

    private float valorCardapioAdulto;

    public CardapioAdulto(float valorCardapioAdulto) {
        this.valorCardapioAdulto = valorCardapioAdulto;
    }

    public float getValorCardapioAdulto() {
        return valorCardapioAdulto;
    }

    public void setValorCardapioAdulto(float valorCardapioAdulto) {
        this.valorCardapioAdulto = valorCardapioAdulto;
    }

    @Override
    public void montagem() {
        System.out.println("Cardapio Adulto:\n-Pegar a Embalagem adulto\n-Inserir Alimentos\n-Fechar");
    }

    @Override
    public float calculoCusto() {
        return getValorCardapioAdulto();
    }
}
