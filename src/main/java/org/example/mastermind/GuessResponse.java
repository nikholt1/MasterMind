package org.example.mastermind;

public class GuessResponse {

    private GuessResult result;
    private GameState state;
    private int remainingGuesses;

    public record GuessResult(int correctPosition, int correctColor, int incorrect) {}

    public enum GameState {
        ONGOING,
        WON,
        LOST
    }
}