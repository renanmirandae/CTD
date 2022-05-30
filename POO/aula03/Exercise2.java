package POO.aula03;
import java.util.Scanner;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = "";
        int userChoice, computerChoice, pointsUser = 0, pointsComputer = 0, start = 0;
        Random random  = new Random();

        do {
            if(user.isEmpty()) {
                System.out.println("Name of user: ");
                user = scanner.next();
            }

            System.out.println("Choose between:\n1- Rock\n2-Paper\n3-Scissors");
            userChoice = scanner.nextInt();

            computerChoice = random.nextInt(1, 3);
            System.out.println("Computer Choice: " + computerChoice);

            if(winner(userChoice, computerChoice) == 1)
            {
                System.out.println(user + " Winner!");
                pointsUser++;
            } else if (winner(userChoice, computerChoice) == 2) {
                System.out.println("Computer Winner!");
                pointsComputer++;
            }else
            {
                System.out.println("Tied!");
            }

            System.out.println("Game Score\n" + user + " " + pointsUser + " | Computer " + pointsComputer);

            System.out.println("Next Step:\n1- Play Again\n2- Exit");
            start = scanner.nextInt();
        }while(start == 1);
    }

    public static int winner(int userChoice, int computerChoice)
    {
        // Return 1 if user winner, 2 if computer winner and 0 for tied
        if((userChoice == 1 && computerChoice == 3))
        {
            return 1;
        }else if(userChoice == 2 && computerChoice == 1)
        {
            return 1;
        }else if(userChoice == 3 && computerChoice == 2)
        {
            return 1;
        }else if(userChoice == computerChoice)
        {
            return 0;
        }else {
            return 2;
        }
    }
}
