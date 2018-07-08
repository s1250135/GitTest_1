import java.util.Random;

class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + roll1);
        System.out.println("Die 2: " + roll2);
        System.out.println("Total value: " + (roll1 + roll2));
    }
}
