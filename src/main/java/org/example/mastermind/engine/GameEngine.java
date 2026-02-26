package org.example.mastermind.engine;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


    public List<Integer> randomCombination(int size) {
        List<Integer> randomCombi = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomCombi.add(random.nextInt(7));
        }

        return randomCombi;
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
        this.combination = combination;
        return combination;
    }

    public boolean resetGame() {
        this.amountOfGuesses = 0;
        this.currentGuesses = 0;
        this.combination = null;
        return true;
    }






}
