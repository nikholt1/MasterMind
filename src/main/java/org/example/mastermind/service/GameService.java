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



    public List<Integer> getCombination() {
        return gameEngine.getCombination(); // random combi fra computer
    }

    public List<Integer> makeGuess(List<Integer> guess) {
        return gameEngine.makeGuess(guess); // sammenligner guess me combination -- sender 1 0 0 1 0? tilbage?
    } // 1 1 1 1 1 vundet --> 00000 ingen rigtige.

    public List<Integer> makeCombination(List<Integer> userCombination) {
        return gameEngine.makeCombination(); // sætter combination til det brugeren har defineret
    }

    public boolean resetGame() {
        return gameEngine.resetGame(); // sætter combination til .empty
    }






}
