public class Pokemon {

    int hp = 100;

    int randomInt() {
        int randomNumber = (int) (Math.random() * 100);
        return randomNumber;
    }

    public void attack(Wildlifepokemon target) {
        int number = randomInt();
        if (number > 50) {
            target.hp -=10; // Decrement target's hp
            System.out.println("Your attack hits the target!");
            System.out.println("Opponent's Pokémon hp: " + target.hp);

        } else if (number == 100) {
            target.hp -= 30; // Decrement target's hp by 10
            System.out.println("Wow! Your attack is very powerful!");
            System.out.println("Opponent's Pokémon hp: " + target.hp);
        } else {
            System.out.println("The attack missed!");
            System.out.println("Opponent's Pokémon hp: " + target.hp);
        }
    }
}
