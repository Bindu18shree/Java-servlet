package com.xworkz.servletchaining.repositary;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.servletchaining.dto.MilkDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MilkRepImpl implements MilkRepo {
    private String url = "jdbc:mysql://localhost:3306/alphabet";
    private String dbUser = "root";
    private String dbSecret = "root";
    private String dbDriverClass = "com.mysql.cj.jdbc.Driver";

    @SneakyThrows
    @Override
    public void save(MilkDto milkDto) {

        System.out.println("should save milkDto to DB" + milkDto);
        System.out.println("Milk Impl repo saved..!");

        String insertMilk = "insert into milk_table values(0,'" + milkDto.getBrand() + "','" + milkDto.getMilkType() + "'," + milkDto.getQuantity() + "," + milkDto.getTotalPrice() + ")";
        //TODO : Check to remove Class.Forname
        Class.forName(dbDriverClass);
        try (Connection connection = DriverManager.getConnection(this.url, this.dbUser, this.dbSecret);
             Statement statement = connection.createStatement();) {
            int count = statement.executeUpdate(insertMilk);
            System.out.println("count after insert:" + count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    @Override
    public List<MilkDto> getAll() {

        System.out.println("running getAll in MilkRepImpl");
        String sql = "select * from milk_table";

        Class.forName(dbDriverClass);

        try (Connection connection = DriverManager.getConnection(this.url, this.dbUser, this.dbSecret);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);

            List<MilkDto> milkDtoList = new ArrayList<>();

            while (resultSet.next())// check row
            {
                int id = resultSet.getInt("milk_id");
                String brand = resultSet.getString("milk_brand");
                String type = resultSet.getString("milk_type");
                int quantity = resultSet.getInt("milk_quantity");
                double totalPrice = resultSet.getDouble("milk_total_price");

                MilkDto milkDto = new MilkDto(brand, type, quantity, totalPrice);
                milkDto.setId(id);
                milkDtoList.add(milkDto);

            }
            System.out.println("Total Rows :" + milkDtoList.size());
            return milkDtoList;
        }


    }
}

