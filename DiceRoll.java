package advanced_concepts;

import java.util.Random;

public class DiceRoll
{
	public static void main(String[] args) {
        Random rand = new Random();
        int diceRoll = rand.nextInt(6)+1; // Simulates a dice roll (1 to 6)
        System.out.println("You rolled a: " + diceRoll);
    }

}
