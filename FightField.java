// FightField.java
import java.util.Scanner;

public class FightField {
    public static void main(String[] args) {
        int pokemonCount = 1;
        Trainer krish = new Trainer();
        Pokemon pikachu = new Pokemon();
        Wildlifepokemon charizard = new Wildlifepokemon();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do:");
            System.out.println("a) Find pokemon");
            System.out.println("b) See my pokemon");
            System.out.println("q) Quit the game");

            String userChoice = input.nextLine();

            if (userChoice.equals("q")) {
                break;
            } else if (userChoice.equals("a")) {
                int randomNumber = (int) (Math.random() * 100);
                if (randomNumber > 50) {
                    while (true) {
                        System.out.println("Yes, I found a Pokemon");
                        System.out.println("a) Attack");
                        System.out.println("b) Catch Pokemon");
                        System.out.println("q) Quit match");

                        String userAction = input.nextLine();
                        if (userAction.equals("q")) {
                            break;
                        } else if (userAction.equals("a")) {
                            pikachu.attack(charizard); // Assuming attack method takes a Pokemon object
                            charizard.attack(pikachu);
                        } else if (userAction.equals("b")) {
                            krish.catchPokemon(charizard.hp, pokemonCount); // Assuming catchPokemon method takes a Pokemon object
                        }
                    }

                } else {
                    System.out.println("Oh no! Couldn't find any Pokemon.");
                }

            } else if (userChoice.equals("b")) {
                krish.seePokemonCount(pokemonCount);
            } else {
                System.out.println("Invalid option. Please choose a valid action.");
            }
        }

        input.close();
    }
}
