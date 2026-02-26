package org.example.mastermind.engine;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private static final Random random = new Random();

    // Combination: 1234
    // Guess: 1122

    // 2, 1, 1, 1
    // int correctColor = 2
    // int correctPosition = 1
    // int incorrect = 0

    private int totalGuesses;
    private int guessesUsed;
    private int amountOfColors;
    private List<Integer> combination;

    public Game(int totalGuesses, int amountOfColors, List<Integer> combination) {
        this.totalGuesses = totalGuesses;
        this.guessesUsed = 0;
        this.amountOfColors = amountOfColors;
        this.combination = combination;
    }

    public Game(int totalGuesses, int amountOfColors) {
        this.totalGuesses = totalGuesses;
        this.guessesUsed = 0;
        this.amountOfColors = amountOfColors;
        this.combination = randomCombination(amountOfColors);
    }

    public int getTotalGuesses() {
        return totalGuesses;
    }

    public int getAmountOfColors() {
        return amountOfColors;
    }

    public List<Integer> getCombination() {
        return combination;
    }

    public List<Integer> randomCombination(int size) {
        List<Integer> randomCombination = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            randomCombination.add(random.nextInt(size));
        }

        return randomCombination;
    }

    public List<Integer> makeGuess(List<Integer> guess) {
        // guess = 12345
        // combination = 54321
        // returner = 11211
        this.guessesUsed++;
        for (int i = guess.size()  ) {

        }
    }

    public List<Integer> makeCombination(List<Integer> combination) {
        this.combination = combination;
        return combination;
    }

    public boolean resetGame() {
        this.totalGuesses = 0;
        this.guessesUsed = 0;
        this.combination = null;
        return true;
    }
}
