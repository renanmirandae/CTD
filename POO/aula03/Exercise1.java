package POO.aula03;
/*
* Implemente um programa que nos permita exibir os primeiros números primos
pelo console, onde é um valor numérico inserido pelo usuário. Por exemplo:
Com n = 7, o que o programa deve retornar é &quot;Os primeiros 7 números primos são:
2, 3, 5, 7, 11, 13, 17.
* */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        int[] primos = new int[numero];
        int index = 0;

        System.out.println("Lista dos " + numero + " primeiros numeros primos sao:");

        for(int i = 0; numero != index; i++)
        {
            if(eDivisivel(i))
            {
                primos[index] = i;
                index++;
            }
        }

        for(int i = 0; i < primos.length; i++)
        {
            System.out.println(primos[i]);
        }


    }
    public static boolean eDivisivel(int numero)
    {
        //Função que retorna se o numero é primo
        if(numero == 2)
        {
            return true;
        }else if(numero == 1 || numero == 0)
        {
            return false;
        }
        for(int i = numero - 1; i > 1; i--)
        {
            if(numero % i == 0)
            {
                return false;
            }
        }

        return true;
    }

}
