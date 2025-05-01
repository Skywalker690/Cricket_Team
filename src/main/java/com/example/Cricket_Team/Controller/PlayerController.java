package com.example.Cricket_Team.Controller;

import com.example.Cricket_Team.Service.PlayerServices;
import com.example.Cricket_Team.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
public class PlayerController {

    @Autowired
    private PlayerServices playerServices;

    @GetMapping("/player")
    public ArrayList<Player> getPlayers(){
        return playerServices.getPlayers();
    }

    @GetMapping("/player/{playerId}")
    public Player getPlayerById(@PathVariable int playerId){
        return playerServices.getPlayerById(playerId);
    }

    @PutMapping("/player")
    public  Player addPlayer(@RequestBody Player player){
        return playerServices.addPlayer(player);
    }

    @PostMapping("/player/{playerId}")
    public Player updatePlayer(@PathVariable int playerId,@RequestBody Player player){
        return playerServices.updatePlayer(playerId,player);
    }

    @DeleteMapping("player/{playerId}")
    public ArrayList<Player> deletePlayer(int playerId){
        return playerServices.deletePlayer(playerId);
    }


}
