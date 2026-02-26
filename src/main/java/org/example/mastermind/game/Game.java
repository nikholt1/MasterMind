package org.example.mastermind.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private static final Random random = new Random();

    private final int amountOfColors;
    private final int codeLength;
    private final int totalGuesses;

    private final List<Integer> combination;

    private GameState gameState;
    private int guessesUsed;

    public Game(int totalGuesses, int codeLength, int amountOfColors) {
        this.totalGuesses = totalGuesses;
        this.codeLength = codeLength;
        this.amountOfColors = amountOfColors;
        this.combination = generateCombination(amountOfColors, codeLength);
        this.gameState = GameState.ONGOING;
        this.guessesUsed = 0;
    }

    private List<Integer> generateCombination(int amountOfColors, int codeLength) {
        List<Integer> combination = new ArrayList<>();

        for (int i = 0; i < codeLength; i++) {
            combination.add(random.nextInt(amountOfColors));
        }

        return combination;
    }

    public GuessResult makeGuess(List<Integer> guess) {

        if (guess.size() != codeLength) {
            throw new IllegalArgumentException("Invalid guess length");
        }

        for (Integer peg : guess) {
            if (peg < 0 || peg >= amountOfColors) {
                throw new IllegalArgumentException("Invalid color value");
            }
        }

        if (gameState != GameState.ONGOING) {
            throw new IllegalStateException("Game already finished");
        }

        guessesUsed++;

        List<PegResult> results = new ArrayList<>();
        boolean[] codeUsed = new boolean[codeLength];
        boolean[] guessUsed = new boolean[codeLength];

        // First pass: exact matches
        for (int i = 0; i < codeLength; i++) {
            if (guess.get(i).equals(combination.get(i))) {
                results.add(PegResult.CORRECT_POSITION_AND_COLOR);
                codeUsed[i] = true;
                guessUsed[i] = true;
            }
        }

        // Second pass: correct color wrong position
        for (int i = 0; i < codeLength; i++) {

            if (guessUsed[i]) continue;

            for (int j = 0; j < codeLength; j++) {

                if (codeUsed[j]) continue;

                if (guess.get(i).equals(combination.get(j))) {
                    results.add(PegResult.CORRECT_COLOR);
                    codeUsed[j] = true;
                    guessUsed[i] = true;
                    break;
                }
            }
        }

        while (results.size() < codeLength) {
            results.add(PegResult.INCORRECT);
        }

        updateGameState(results);

        return new GuessResult(
                results,
                gameState,
                totalGuesses - guessesUsed
        );
    }

    private void updateGameState(List<PegResult> results) {
        long correctCount = results.stream()
                .filter(peg -> peg == PegResult.CORRECT_POSITION_AND_COLOR)
                .count();

        if (correctCount == codeLength) {
            gameState = GameState.WON;
        } else if (guessesUsed >= totalGuesses) {
            gameState = GameState.LOST;
        }
    }

    public GameState getState() {
        return gameState;
    }
}
