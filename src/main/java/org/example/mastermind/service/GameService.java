package org.example.mastermind.service;


import org.example.mastermind.engine.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private Game currentGame;

    public Game startGame(int amountOfGuesses, int amountOfColors, List<Integer> combination) {
        currentGame = new Game(amountOfGuesses, amountOfColors, combination);
        return currentGame;
    }

    public Game startGameWithRandomCombination(int amountOfGuesses, int amountOfColors) {
        currentGame = new Game(amountOfGuesses, amountOfColors);
        return currentGame;
    }

    public List<Integer> makeGuess(List<Integer> guess) {
        return currentGame.makeGuess(guess); // sammenligner guess me combination -- sender 1 0 0 1 0? tilbage?
    } // 1 1 1 1 1 vundet --> 00000 ingen rigtige. // 1 0 1 2  1 = correct colour but wrong place 2 = right colour right place 0 = not correct

    public boolean resetGame() {
        currentGame = null;
        return true;
    }
}
