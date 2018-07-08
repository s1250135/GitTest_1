import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;

        Scanner sc = new Scanner(System.in);
        String name;

        try{
            System.out.println("What is your name?");
            System.out.print("> ");

            name = sc.nextLine();

            System.out.println("Hello, " + name + "!");

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + roll1);
            System.out.println("Die 2: " + roll2);
            System.out.println("Total value: " + (roll1 + roll2));

            if((roll1 + roll2) >= 7){
                System.out.println(name + " won!");
            }else{
                System.out.println(name + " lost");
            }

        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
}
