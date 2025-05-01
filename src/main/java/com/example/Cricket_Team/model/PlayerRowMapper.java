package com.example.Cricket_Team.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player> {

    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Player(
                rs.getInt("playerId"),
                rs.getString("playerName"),
                rs.getInt("jerseyNumber"),
                rs.getString("role"));
    }
}
