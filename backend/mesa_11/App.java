package mesa_11;

public class App {
    public static void main(String[] args) throws Exception{
        //Instancia de banco de dados
        BancoDados bancoDados = new BancoDados();

        bancoDados.getConnection();
        bancoDados.criarTabela();

        //Instanciando objetos Figura
        Figura figura1 = new Figura(1, "Circulo", "Vermelho");
        Figura figura2 = new Figura(2, "Circulo", "Laranja");

        Figura figura3 = new Figura(3, "Quadrado", "Azul");
        Figura figura4 = new Figura(4, "Quadrado", "Violeta");
        Figura figura5 = new Figura(5, "Quadrado", "Amarelo");

        //Inserindo os dados das figuras no banco de dados
        bancoDados.inserirFigura(figura1.getId(), figura1.getTipo(), figura1.getCor());
        bancoDados.inserirFigura(figura2.getId(), figura2.getTipo(), figura2.getCor());
        bancoDados.inserirFigura(figura3.getId(), figura3.getTipo(), figura3.getCor());
        bancoDados.inserirFigura(figura4.getId(), figura4.getTipo(), figura4.getCor());
        bancoDados.inserirFigura(figura5.getId(), figura5.getTipo(), figura5.getCor());

        //Exibindo os dados do banco
        bancoDados.exibirConsulta();
    }
}
