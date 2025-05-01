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
}
