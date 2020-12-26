package com.flower.dao.impl;

import com.flower.dao.FlowerDao;
import com.flower.entity.Flower;
import com.flower.entity.User;
import com.flower.utiils.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FlowerImpl extends BaseDao implements FlowerDao {
    @Override
    public boolean addFlower(Flower flower) {
        String sql = "INSERT INTO flower_shop.flower (flower_code, trade_type, flower_name, material, pack, descs, price, discount, image, deliverarea, status, create_time, remark) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
        Object[] obj = {
                flower.getFlower_code(),
                flower.getTrade_type(),
                flower.getFlower_name(),
                flower.getMaterial(),
                flower.getPack(),
                flower.getDescs(),
                flower.getPrice(),
                flower.getDiscount(),
                flower.getImage(),
                flower.getDeliverarea(),
                flower.getStatus(),
                flower.getCreate_time(),
                flower.getRemark()
        };
        return operation(sql,obj);
    }

    @Override
    public boolean subFlower(String flowerId) {
        String sql = "DELETE FROM flower_shop.flower WHERE flower_code=?;";
        Object[] obj = {
                flowerId
        };
        return operation(sql,obj);
    }

    @Override
    public boolean updateFlower(Flower flower) {
        String sql = "UPDATE flower_shop.flower SET trade_type=?, flower_name=?, material=?, pack=?, descs=?, price=?, discount=?, image=?, deliverarea=?, status=?, create_time=?, remark=? WHERE flower_code=?;";
        Object[] obj = {
                flower.getRemark(),
                flower.getTrade_type(),
                flower.getFlower_name(),
                flower.getMaterial(),
                flower.getPack(),
                flower.getDescs(),
                flower.getPrice(),
                flower.getDiscount(),
                flower.getImage(),
                flower.getDeliverarea(),
                flower.getStatus(),
                flower.getCreate_time(),
                flower.getFlower_code()
        };
        return operation(sql,obj);
    }

    @Override
    public ArrayList<Flower> viewFlowerMsg() {
        String sql = "select * from flower_shop.flower;";
        ArrayList<Flower> flowerList = new ArrayList<>();
        Connection connection = onConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Flower flower = new Flower();
                flower.setFlower_code(resultSet.getString("flower_code"));
                flower.setTrade_type(resultSet.getString("trade_type"));
                flower.setFlower_name(resultSet.getString("flower_name"));
                flower.setMaterial(resultSet.getString("material"));
                flower.setPack(resultSet.getString("pack"));
                flower.setDescs(resultSet.getString("descs"));
                flower.setPrice(resultSet.getBigDecimal("price"));
                flower.setDiscount(resultSet.getBigDecimal("discount"));
                flower.setImage(resultSet.getString("image"));
                flower.setDeliverarea(resultSet.getString("deliverarea"));
                flower.setStatus(resultSet.getInt("status"));
                flower.setCreate_time(resultSet.getString("create_time"));
                flower.setRemark(resultSet.getString("remark"));
                flowerList.add(flower);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            this.offConnection(connection, preparedStatement, resultSet);
        }
        return null;
    }
}
