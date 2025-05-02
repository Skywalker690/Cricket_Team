package com.example.Cricket_Team.Controller;

import com.example.Cricket_Team.Service.PlayerServices;
import com.example.Cricket_Team.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerServices playerServices;

    // Endpoint to get all players
    @GetMapping
    public ArrayList<Player> getPlayers() {
        return playerServices.getPlayers();
    }

    // Endpoint to get a specific player by playerId
    @GetMapping("/{playerId}")
    public Player getPlayerById(@PathVariable int playerId) {
        return playerServices.getPlayerById(playerId);
    }

    // Endpoint to add a new player
    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerServices.addPlayer(player);
    }

    // Endpoint to update an existing player by playerId
    @PutMapping("/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return playerServices.updatePlayer(playerId, player);
    }

    // Endpoint to delete a player by playerId
    @DeleteMapping("/{playerId}")
    public ArrayList<Player> deletePlayer(@PathVariable int playerId) {
        return playerServices.deletePlayer(playerId);
    }
}
