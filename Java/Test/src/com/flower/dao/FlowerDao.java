package com.flower.dao;

import com.flower.entity.Flower;

import java.util.ArrayList;

public interface FlowerDao {
    boolean addFlower(Flower flower);

    boolean subFlower(String flowerId);

    boolean updateFlower(Flower flower);

    ArrayList<Flower> viewFlowerMsg();

}
