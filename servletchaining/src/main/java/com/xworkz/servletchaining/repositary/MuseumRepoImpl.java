package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.MuseumTicketDto;
import com.xworkz.servletchaining.service.MuseumService;
import com.xworkz.servletchaining.service.MuseumServiceImpl;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuseumRepoImpl implements MuseumRepo {

    private String url = "jdbc:mysql://localhost:3306/alphabet";
    private String dbUser = "root";
    private String dbSecret = "root";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";

    @SneakyThrows
    @Override
    public void save(MuseumTicketDto museumTicketDto) {

        System.out.println("should save museumDto to DB" + museumTicketDto);
        System.out.println("Museum Impl repo saved..!");

        String insertMilk = "insert into museum_table values(0,'" + museumTicketDto.getName() + "'," + museumTicketDto.getNoOfAdults() + "," + museumTicketDto.getNoOfChildren() + "," + museumTicketDto.getMobileNo() + ",'" + museumTicketDto.getEmail() + "'," + museumTicketDto.getTotalCost() + ")";

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
    public List<MuseumTicketDto> getAll() {

        System.out.println("Running getAll in MuseumRepoImpl");
        String query = "select * from museum_table";

        Class.forName(dbDriver);

        try (Connection connection = DriverManager.getConnection(url, dbUser, dbSecret);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);

            List<MuseumTicketDto> ticketDtoList = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int noOfAdults = resultSet.getInt("no_of_adults");
                int noOfChildren = resultSet.getInt("no_of_children");
                long mobileNumber = resultSet.getLong("mobile_no");
                String email = resultSet.getString("email");
                double totalCost = resultSet.getDouble("total_cost");

                MuseumTicketDto museumTicketDto = new MuseumTicketDto(name, noOfAdults, noOfChildren, mobileNumber, email, totalCost);

                museumTicketDto.setId(id);
                ticketDtoList.add(museumTicketDto);
            }

            System.out.println("Number of rows inserted :" + ticketDtoList.size());
            return ticketDtoList;
        }

    }
}
