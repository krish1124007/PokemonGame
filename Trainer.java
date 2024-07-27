
// Trainer.java
public class Trainer {
    int pokemonCount = 1;

    int randomInt() {
        return (int) (Math.random() * 100);
    }

    public void win(int wildPokemonHp) {
        if (wildPokemonHp < 9) {
            System.out.println("Yes! I won this match!");
        }
    }

    public void catchPokemon(int wildPokemonHp, int pokemonCount) {
        int number = randomInt();
        if (wildPokemonHp < 30) {
            if (number > 50) {
                System.out.println("Yes! I caught this Pokemon!");
                pokemonCount++; // Increment the Trainer's pokemon count

            } else {
                System.out.println("Oh no! It's a very strong Pokemon.");
            }
        } else {
            System.out.println("The Pokemon still has the power to fight.");
        }
    }

    public void seePokemonCount(int pokemonCount) {
        System.out.println("You have " + pokemonCount + " Pokemon");
    }
}
