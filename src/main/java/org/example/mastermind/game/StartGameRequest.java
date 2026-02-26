package org.example.mastermind.game;

public record StartGameRequest(int maxGuesses, int codeLength, int colorRange) {}
