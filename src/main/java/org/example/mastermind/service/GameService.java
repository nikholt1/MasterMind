package org.example.mastermind.service;


import org.example.mastermind.engine.GameEngine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameEngine gameEngine;


    public GameService(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    public void gameSetup(int amountOfGuesses) {
        gameEngine.setGuesses(amountOfGuesses);
    } // {1, 2, 3, 4, 5, 6}

    public List<Integer> getCombination() {
        return gameEngine.getCombination(); // random combi fra computer
    }

    public List<Integer> makeGuess(List<Integer> guess) {
        return gameEngine.makeGuess(guess); // sammenligner guess me combination -- sender 1 0 0 1 0? tilbage?
    } // 1 1 1 1 1 vundet --> 00000 ingen rigtige. // 1 0 1 2  1 = correct colour but wrong place 2 = right colour right place 0 = not correct

    public List<Integer> makeCombination(List<Integer> userCombination) {
        return gameEngine.makeCombination(userCombination); // sætter combination til det brugeren har defineret
    }
    public List<Integer> randomeCombination(int size) {
        return gameEngine.randomCombination(size);
    }

    public boolean resetGame() {
        return gameEngine.resetGame(); // sætter combination til .empty
    }

    public int getAmountOfGuesses() {
        return gameEngine.getAmountOfGuesses();
    }

    public void setAmountOfGuesses(int guesses) {
        gameEngine.setGuesses(guesses);
    }






}
