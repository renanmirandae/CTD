package mesa_19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> lista1 = new ArrayList<>();

        Contato contato1 = new Contato("Renan", "renantest@gmail.com", "85452585");
        Contato contato2 = new Contato("Lais", "lais@hotmail.com", "45258952");

        lista1.add(contato1);
        lista1.add(contato2);

        //Salvando os dados no arquivo de texto

        FileOutputStream fo = null;

        try
        {
            fo = new FileOutputStream("Output-Contato.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

            objectOutputStream.writeObject(lista1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Recuperando dados

        List<Contato> lista2 = null;
        FileInputStream fi = null;

        try
        {
            fi = new FileInputStream("Output-Contato.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fi);

            lista2 = (ArrayList)objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Contato contato: lista2)
        {
            System.out.println("Nome: " + contato.getNome() +" | "+ "E-mail: " + contato.getEmail() + " | " + "Telefone: " + contato.getTelefone());
        }
    }
}
