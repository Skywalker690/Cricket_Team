package com.example.Cricket_Team.Service;

import com.example.Cricket_Team.Repositry.PlayerRepo;
import com.example.Cricket_Team.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlayerServices implements PlayerRepo {
    @Override
    public ArrayList<Player> getPlayers() {
        return null;
    }

    @Override
    public Player getPlayerById(int playerId) {
        return null;
    }

    @Override
    public Player addPlayer(Player player) {
        return null;
    }

    @Override
    public Player updatePlayer(int playerId, Player player) {
        return null;
    }

    @Override
    public ArrayList<Player> deletePlayer(int playerId) {
        return null;
    }
}
