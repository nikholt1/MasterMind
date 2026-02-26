package org.example.mastermind.controller;

import org.example.mastermind.game.GameState;
import org.example.mastermind.game.GuessResult;
import org.example.mastermind.game.StartGameRequest;
import org.example.mastermind.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    public record StartGameResponse(GameState gameState) {}

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/start")
    public ResponseEntity<StartGameResponse> startGame(@RequestBody StartGameRequest request) {
        gameService.startNewGame(
                request.maxGuesses(),
                request.codeLength(),
                request.colorRange()
        );
        return ResponseEntity
                .status(201)
                .body(new StartGameResponse(GameState.ONGOING));
    }

    @PostMapping("/guess")
    public ResponseEntity<GuessResult> makeGuess(@RequestBody List<Integer> guess) {
        return ResponseEntity.ok(gameService.makeGuess(guess));
    }

    @GetMapping("/state")
    public ResponseEntity<GameState> getState() {
        return ResponseEntity.ok(gameService.getState());
    }
}
