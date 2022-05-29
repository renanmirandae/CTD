package aula02;

/*
* Escreva uma função que receba três números e retorne o maior valor entre os três números.
* Em seguida, faça um programa que permita a entrada de 3 valores pelo usuário, use a função e
* exiba o resultado.
* */

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Terceiro numero: ");
        num3 = scanner.nextInt();

        System.out.println("O maior numero e: " + maior(num1, num2, num3));
    }

    public static int maior(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            return a;
        }else if(b > a && b > c)
        {
            return b;
        }else
        {
            return c;
        }
    }

}