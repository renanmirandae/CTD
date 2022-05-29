package aula02;

import java.util.Scanner;
/*
* Faça um programa Java que solicite do usuário seu nome e sobrenome separadamente, e a sua data de nascimento.  Para a data solicite que o
* usuário digite 3 valores que representam o dia, mês e ano. Além disso, a partir das variáveis do nome e sobrenome ​​obtenha em uma terceira com as iniciais do usuário.
Em seguida, exiba uma mensagem, com seu nome, as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"

*/

public class Exercise01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String nome, sobrenome;
        Integer[] nascimento = new Integer[3];

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Dados do seu nascimento:");
        System.out.println("Dia:");
        nascimento[0] = scanner.nextInt();

        System.out.println("Mes:");
        nascimento[1] = scanner.nextInt();

        System.out.println("Ano:");
        nascimento[2] = scanner.nextInt();

        System.out.println("Seu nome e " + nome + " " + sobrenome);
        System.out.println("Data de nascimento: " + nascimento[0] + "/" + nascimento[1] + "/" + nascimento[2]);
    }


}