package aula_19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cao> cao = new ArrayList<>();

        Cao cao1 = new Cao("Pluto", (byte) 3);
        Cao cao2 = new Cao("Snoopy", (byte) 7);

        cao.add(cao1);
        cao.add(cao2);

        //Salvando dados em um arquivo de texto

        FileOutputStream fo = null;
        try
        {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

            objectOutputStream.writeObject(cao);
        }catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Recuperando toda a coleção
        List<Cao> caoDois = null;
        FileInputStream fi = null;

        try
        {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fi);

            caoDois = (ArrayList)objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Cao cachorro: caoDois)
        {
            System.out.println(cachorro.getNome() + "  :  " + cachorro.getIdade());
        }

    }
}
