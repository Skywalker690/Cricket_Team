package com.example.Cricket_Team.Service;

import com.example.Cricket_Team.Repositry.PlayerRepo;
import com.example.Cricket_Team.model.Player;
import com.example.Cricket_Team.model.PlayerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Service
public class PlayerServices implements PlayerRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to fetch all players
    @Override
    public ArrayList<Player> getPlayers() {
        return (ArrayList<Player>) jdbcTemplate.query("SELECT * FROM player", new PlayerRowMapper());
    }

    // Method to fetch player by playerId
    @Override
    public Player getPlayerById(int playerId) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM player WHERE playerId=?",
                    new PlayerRowMapper(), playerId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Player not found");
        }
    }

    // Method to add a new player
    @Override
    public Player addPlayer(Player player) {
        jdbcTemplate.update("INSERT INTO player(playerName, jerseyNumber, role) VALUES(?, ?, ?)",
                player.getPlayerName(), player.getJerseyNumber(), player.getRole());
        return player;
    }

    // Method to update an existing player's details
    @Override
    public Player updatePlayer(int playerId, Player player) {
        // First, check if the player exists
        Player existingPlayer = getPlayerById(playerId);
        if (existingPlayer == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Player not found");
        }

        // Update fields if not null
        if (player.getPlayerName() != null) {
            jdbcTemplate.update("UPDATE player SET playerName = ? WHERE playerId = ?",
                    player.getPlayerName(), playerId);
        }
        if (player.getJerseyNumber() != 0) {
            jdbcTemplate.update("UPDATE player SET jerseyNumber = ? WHERE playerId = ?",
                    player.getJerseyNumber(), playerId);
        }
        if (player.getRole() != null) {
            jdbcTemplate.update("UPDATE player SET role = ? WHERE playerId = ?",
                    player.getRole(), playerId);
        }

        // Return updated player
        return getPlayerById(playerId);
    }

    // Method to delete a player by playerId
    @Override
    public ArrayList<Player> deletePlayer(int playerId) {
        // Delete player
        jdbcTemplate.update("DELETE FROM player WHERE playerId = ?", playerId);

        // Optionally return the list of remaining players
        return new ArrayList<>(jdbcTemplate.query("SELECT * FROM player", new PlayerRowMapper()));
    }
}
