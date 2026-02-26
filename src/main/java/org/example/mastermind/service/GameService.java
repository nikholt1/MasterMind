package org.example.mastermind.service;


import org.example.mastermind.game.GameState;
import org.example.mastermind.game.GuessResult;
import org.example.mastermind.game.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private Game currentGame;

    public void startNewGame(int guesses, int codeLength, int colorRange) {
        currentGame = new Game(guesses, codeLength, colorRange);
    }

    public GuessResult makeGuess(List<Integer> guess) {
        return currentGame.makeGuess(guess);
    }

    public GameState getState() {
        return currentGame.getState();
    }
}
