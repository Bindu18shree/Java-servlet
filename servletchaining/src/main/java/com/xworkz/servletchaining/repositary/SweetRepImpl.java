package com.xworkz.servletchaining.repositary;

import com.xworkz.servletchaining.dto.SweetDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetRepImpl implements SweetRepo {

    private String url = "jdbc:mysql://localhost:3306/alphabet";
    private String dbUser = "root";
    private String dbSecret = "root";
    private String dbDriverClass = "com.mysql.cj.jdbc.Driver";

    @SneakyThrows
    @Override
    public void save(SweetDto sweetDto) {

        System.out.println("should save SweetDto to DB" + sweetDto);
        System.out.println("Sweet Impl repo saved..!");


        String insertSweet = "insert into sweet_table values(0,'" + sweetDto.getSweetName() + "','" + sweetDto.getShopName() + "','" + sweetDto.getIsSpecial() + "'," + sweetDto.getQuantity() + "," + sweetDto.getTotalCost() + ")";

        Class.forName(dbDriverClass);
        try (Connection connection = DriverManager.getConnection(url, dbUser, dbSecret);
             Statement statement = connection.createStatement();) {


            int row = statement.executeUpdate(insertSweet);
            System.out.println("Number of rows inserted : " + row);

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    @SneakyThrows
    @Override
    public List<SweetDto> getAll() {

        System.out.println("Running getAll in SweetRepImpl");
        String query = "select * from sweet_table";

        Class.forName(dbDriverClass);

        try (Connection connection = DriverManager.getConnection(url, dbUser, dbSecret);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);

            List<SweetDto> sweetDtoList = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String sweetName = resultSet.getString("sweet_Name");
                String shopName = resultSet.getString("shop_Name");
                boolean sweetType = resultSet.getBoolean("sweet_type");
                int sweetQuantity = resultSet.getInt("sweet_Quantity");
                double sweetPrice = resultSet.getDouble("sweet_Price");

                SweetDto sweetDto = new SweetDto(sweetName, shopName, sweetType, sweetQuantity, sweetPrice);

                sweetDto.setId(id);
                sweetDtoList.add(sweetDto);
            }

            System.out.println("no of rows inserted : " + sweetDtoList.size());
            return sweetDtoList;
        }
    }
}
