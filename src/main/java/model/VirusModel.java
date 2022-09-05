package model;

import database.DBConnection;
import entity.Virus;
import lombok.extern.slf4j.Slf4j;
import java.sql.*;

@Slf4j
public class VirusModel {

    private final DBConnection instance = DBConnection.getInstance();
    private Connection connection;

    public VirusModel(){

        connection = instance.getConnection();
    }

    public Virus getById(long id){

        try {
            String sql = "SELECT * FROM virus WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();

            if(result.next()){

                return Virus.builder()
                        .id(result.getInt("id"))
                        .name(result.getString("name"))
                        .build();
            }

        } catch (SQLException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }


        return null;
    }
}
