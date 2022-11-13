package homeWork5;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of the 1 team");
        String teamName1 = scanner.next();
        System.out.println("Name of the 1 team is " + teamName1);

        System.out.println("Enter amount of frags for the 1 player from the 1 team");
        int player1Team1 = scanner.nextInt();
        System.out.println("Frags of the 1 player from the 1 team " + player1Team1);

        System.out.println("Enter amount of frags for the 2 player from the 1 team");
        int player2Team1 = scanner.nextInt();
        System.out.println("Frags of the 2 player from the 1 team " + player2Team1);

        System.out.println("Enter amount of frags for the 3 player from the 1 team");
        int player3Team1 = scanner.nextInt();
        System.out.println("Frags of the 3 player from the 1 team " + player3Team1);

        System.out.println("Enter amount of frags for the 4 player from the 1 team");
        int player4Team1 = scanner.nextInt();
        System.out.println("Frags of the 4 player from the 1 team " + player4Team1);

        System.out.println("Enter amount of frags for the 5 player from the 1 team");
        int player5Team1 = scanner.nextInt();
        System.out.println("Frags of the 5 player from the 1 team " + player5Team1);


        System.out.println("Enter name of the 2 team");
        String teamName2 = scanner.next();
        System.out.println("Name of the 2 team is " + teamName2);

        System.out.println("Enter amount of frags for the 1 player from the 2 team");
        int player1Team2 = scanner.nextInt();
        System.out.println("Frags of the 1 player from the 2 team " + player1Team2);

        System.out.println("Enter amount of frags for the 2 player from the 2 team");
        int player2Team2 = scanner.nextInt();
        System.out.println("Frags of the 2 player from the 2 team " + player2Team2);

        System.out.println("Enter amount of frags for the 3 player from the 2 team");
        int player3Team2 = scanner.nextInt();
        System.out.println("Frags of the 3 player from the 2 team " + player3Team2);

        System.out.println("Enter amount of frags for the 4 player from the 2 team");
        int player4Team2 = scanner.nextInt();
        System.out.println("Frags of the 4 player from the 2 team " + player4Team2);

        System.out.println("Enter amount of frags for the 5 player from the 2 team");
        int player5Team2 = scanner.nextInt();
        System.out.println("Frags of the 5 player from the 2 team " + player5Team2);


        int resultTeam1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        int resultTeam2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;

        System.out.println("The arithmetic average of 1 team's points " + resultTeam1);
        System.out.println("The arithmetic average of 2 team's points " + resultTeam2);

        if (resultTeam1 > resultTeam2) {
            System.out.println("The " + teamName1 + " wins, with result " + resultTeam1 + " point's");
        } else if (resultTeam1 < resultTeam2) {
            System.out.println("The " + teamName2 + " wins, with result " + resultTeam2 + " point's");
        } else {
            System.out.println("The draw");
        }
    }
}