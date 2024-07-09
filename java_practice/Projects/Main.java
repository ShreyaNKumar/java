package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pokemon {
    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int level;
    private int experience;
    private List<Move> moves;
    private boolean isWild;

    // Constructor
    public Pokemon(String name, String type, int health, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, List<Move> moves, boolean isWild) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.level = level;
        this.experience = 0;
        this.moves = moves;
        this.isWild = isWild;
    }

    // Methods
    public void attack(Pokemon opponent, Move move) {
        // Calculate damage based on types and stats
        int damage = calculateDamage(move, opponent);
        opponent.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            faint();
        }
    }

    public void gainExperience(int exp) {
        this.experience += exp;
        checkLevelUp();
    }

    public void levelUp() {
        this.level++;
        increaseStats();
        learnNewMoves();
    }

    public void learnMove(Move move) {
        if (this.moves.size() < 4) {
            this.moves.add(move);
        } else {
            // Logic for replacing an existing move
        }
    }

    public int getStat(String stat) {
        switch (stat.toLowerCase()) {
            case "health": return this.health;
            case "attack": return this.attack;
            case "defense": return this.defense;
            case "specialattack": return this.specialAttack;
            case "specialdefense": return this.specialDefense;
            case "speed": return this.speed;
            default: return 0;
        }
    }

    private int calculateDamage(Move move, Pokemon opponent) {
        // Implement damage calculation logic
        return move.getPower(); // Placeholder
    }

    private void faint() {
        System.out.println(this.name + " has fainted!");
    }

    private void checkLevelUp() {
        if (this.experience >= this.level * 100) {
            levelUp();
        }
    }

    private void increaseStats() {
        this.health += 10;
        this.attack += 5;
        this.defense += 5;
        this.specialAttack += 5;
        this.specialDefense += 5;
        this.speed += 5;
    }

    private void learnNewMoves() {
        // Logic for learning new moves
    }
}

class Move {
    private String name;
    private String type;
    private int power;
    private int accuracy;
    private String category;
    private String effect;

    // Constructor
    public Move(String name, String type, int power, int accuracy, String category, String effect) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.category = category;
        this.effect = effect;
    }

    // Methods
    public void applyEffect(Pokemon target) {
        // Execute the move's effect (if any)
    }

    // Getters
    public int getPower() {
        return power;
    }
}

class Trainer {
    private String name;
    private List<Pokemon> team;
    private List<Item> inventory;

    // Constructor
    public Trainer(String name, List<Pokemon> team, List<Item> inventory) {
        this.name = name;
        this.team = team;
        this.inventory = inventory;
    }

    // Methods
    public void catchPokemon(Pokemon wildPokemon) {
        // Attempts to catch a wild Pokémon with a Pokeball
    }

    public void useItem(Item item, Pokemon target) {
        item.use(target);
    }

    public void battle(Trainer opponent) {
        // Engage in a turn-based battle with another trainer
    }
}

class Item {
    private String name;
    private String type;
    private String effect;

    // Constructor
    public Item(String name, String type, String effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    // Methods
    public void use(Pokemon target) {
        // Apply the item's effect to a chosen Pokémon
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Move tackle = new Move("Tackle", "Normal", 40, 100, "Physical", null);
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55, 40, 50, 50, 90, 5, new ArrayList<>(Arrays.asList(tackle)), true);

        Trainer ash = new Trainer("Ash", new ArrayList<>(Arrays.asList(pikachu)), new ArrayList<>());

        // Add more Pokémon, moves, and trainers to build the game
    }
}

