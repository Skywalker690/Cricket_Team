package com.example.Cricket_Team.Repositry;

import com.example.Cricket_Team.model.Player;

import java.util.ArrayList;

public interface PlayerRepo {

    ArrayList<Player> getPlayers();
    Player getPlayerById(int playerId);
    Player addPlayer(Player player);
    Player updatePlayer(int playerId,Player player);
    ArrayList<Player> deletePlayer(int playerId);

}
