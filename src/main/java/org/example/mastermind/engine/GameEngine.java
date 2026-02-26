package org.example.mastermind.engine;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameEngine {

    int amountOfGuesses;
    int currentGuesses = 0;
    public GameEngine() {}



    public List<Integer> combination;


    public void setGuesses(int amountOfGuesses) {
        this.amountOfGuesses = amountOfGuesses;
    }
    public int getAmountOfGuesses() {
        return amountOfGuesses;
    }

    public void setCombination(List<Integer> combination) {
        this.combination = combination;
    }
    public List<Integer> getCombination() {
        return combination;
    }

    public List<Integer> makeGuess(List<Integer> guess) {
        // guess = 12345
        // combination = 54321
        // returner = 11211
        currentGuesses++ ;
        for (int i = guess.size(); ) {

        }


    }

    public List<Integer> makeCombination(List<Integer> combination) {
        setCombination(combination);
    }



//    public List<Integer> getCombination() {
//        return gameEngine.getCombination(); // random combi fra computer
//    }
//
//    public List<Integer> makeGuess(List<Integer> guess) {
//        return gameEngine.makeGuess(guess); // sammenligner guess me combination -- sender 1 0 0 1 0? tilbage?
//    } // 1 1 1 1 1 vundet --> 00000 ingen rigtige.
//
//    public List<Integer> makeCombination(List<Integer> userCombination) {
//        return gameEngine.makeCombination(); // sætter combination til det brugeren har defineret
//    }
//
//    public boolean resetGame() {
//        return gameEngine.resetGame(); // sætter combination til .empty
//    }
}
