package mesa_10;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Instanciando a primeira Lista
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        //Adicionando elementos a lista

        lista1.add(15);
        lista1.add(35);
        lista1.add(50);
        lista1.add(100);
        lista1.add(37);
        lista1.add(86);

        //Instanciando minha classe Calculo
        Calculo calculo = new Calculo(lista1);

        calculo.checarLista();
    }
}
