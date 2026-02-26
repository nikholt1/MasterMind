package org.example.mastermind.game;

import java.util.List;

public record GuessResult(List<PegResult> pegResults, GameState gameState, int remainingGuesses) {}
