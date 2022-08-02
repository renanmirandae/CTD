package mesa_02;

public class CardapioInfantil extends Empresa{

    private float valorCardapioInfantil;
    private float custoAdicional;

    public CardapioInfantil(float valorCardapioInfantil, float custoAdicional) {
        this.valorCardapioInfantil = valorCardapioInfantil;
        this.custoAdicional = custoAdicional;
    }

    public float getValorCardapioInfantil() {
        return valorCardapioInfantil;
    }

    public void setValorCardapioInfantil(float valorCardapioInfantil) {
        this.valorCardapioInfantil = valorCardapioInfantil;
    }

    public float getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(float custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public void montagem() {
        System.out.println("Cardapio Infantil:\n-Pegar embalagem Infantil\n-Inserir Alimentos\n-Adicionar presente surpresa\n-Fechar");
    }

    @Override
    public float calculoCusto() {
        return getValorCardapioInfantil() + getCustoAdicional();
    }
}
