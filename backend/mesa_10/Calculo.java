package mesa_10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Calculo {
    private ArrayList<Integer> listaInteiros;
    private static final Logger log = Logger.getLogger(Calculo.class);

    public Calculo(ArrayList<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    public ArrayList<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void setListaInteiros(ArrayList<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    private void tamanhoLista()
    {
        if (getListaInteiros().size() > 5) {
            log.info("O comprimento da lista e maior do que 5.");
        } else if (getListaInteiros().size() > 10) {
            log.info("O comprimento da lista e maior do que 10.");
        }
    }

    private Integer media()
    {
        Integer media;
        Optional<Integer> reduce = getListaInteiros().stream().reduce((numero1, numero2) -> numero1 + numero2);

        media = reduce.get() / getListaInteiros().size();
        log.info("A media desta lista e: " + media);
        return media;
    }

    public void checarLista()
    {
        try
        {
            tamanhoLista();
            media();
        }catch(NoSuchElementException noSuchElementException)
        {
            log.info("A lista nao contem elementos");
            noSuchElementException.printStackTrace();
        }
    }
}
