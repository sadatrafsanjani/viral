package dao;

import database.DBConnection;
import entity.Disease;
import lombok.extern.slf4j.Slf4j;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DiseaseDao {

    private final DBConnection instance = DBConnection.getInstance();
    private Connection connection;
    private VirusDao virusDao = new VirusDao();

    public DiseaseDao(){

        connection = instance.getConnection();
    }

    public List<Disease> getDiseasesByVirusId(long virusId){

        List<Disease> diseaseList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM disease WHERE virus_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, virusId);
            ResultSet result = statement.executeQuery();

            while(result.next()){

                diseaseList.add(
                        Disease.builder()
                                .id(result.getInt("id"))
                                .virus(virusDao.getById(result.getInt("virus_id")))
                                .name(result.getString("name"))
                                .fatality(result.getString("fatality"))
                                .build()
                );
            }

        } catch (SQLException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }

        return diseaseList;
    }
}
