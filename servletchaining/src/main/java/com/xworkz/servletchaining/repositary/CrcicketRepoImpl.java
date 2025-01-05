package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.CricketDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CrcicketRepoImpl implements CricketRepo {

    String url = "jdbc:mysql://localhost:3306/alphabet";
    String dbUser = "root";
    String dbSecret = "root";
    String dbDriver = "com.mysql.cj.jdbc.Driver";

    @SneakyThrows
    @Override
    public void save(CricketDto cricketDto) {

        System.out.println("should save cricketDto to DB" + cricketDto);
        System.out.println("Cricket Impl repo saved..!");

        String insertMilk = "insert into cricket_table values(0,'" + cricketDto.getTournamentName() + "','" + cricketDto.getLocation() + "','" + cricketDto.getStartDate() + "','" + cricketDto.getEndDate() + "', '" + cricketDto.getFormat() + "', '" + cricketDto.getStatus() + "'," + cricketDto.getPrizeMoney() + ", " + cricketDto.getNoOfTeams() + ")";
        Class.forName(dbDriver);
        try (Connection connection = DriverManager.getConnection(url, dbUser, dbSecret);
             Statement statement = connection.createStatement()) {

            int count = statement.executeUpdate(insertMilk);
            System.out.println("count after insert:" + count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @SneakyThrows
    @Override
    public List<CricketDto> getAll() {

        System.out.println("Running getAll in cricket repo impl...");
        String query = "select * from cricket_table";

        Class.forName(dbDriver);

        try(Connection connection = DriverManager.getConnection(url, dbUser, dbSecret);
        Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);

            List<CricketDto> cricketDtoList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("tournament_Name");
                String location = resultSet.getString("location");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");
                String format = resultSet.getString("format");
                String status = resultSet.getString("status");
                double prize = resultSet.getDouble("prize_money");
                int teams = resultSet.getInt("no_of_teams");

                CricketDto cricketDto = new CricketDto(name,location,startDate,endDate,format,status,prize,teams);

                cricketDto.setId(id);
                cricketDtoList.add(cricketDto);

            }

            System.out.println("no of rows inserted : " +cricketDtoList.size());
            return  cricketDtoList;

        }

    }
}


