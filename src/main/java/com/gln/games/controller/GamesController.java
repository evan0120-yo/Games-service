package com.gln.games.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("Games Service OK - Port: " + serverPort);
    }

    @GetMapping("/info")
    public ResponseEntity<?> getGameInfo() {
        return ResponseEntity.ok("Games Service v1.0.0 running on port " + serverPort);
    }

    @GetMapping("/list")
    public ResponseEntity<?> getGameList() {
        return ResponseEntity.ok("Game List: [Game1, Game2, Game3]");
    }
}
