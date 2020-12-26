package com.flower.dao.impl;

import com.flower.dao.CartDao;
import com.flower.entity.Cart;
import com.flower.utiils.BaseDao;

public class CartImpl extends BaseDao implements CartDao {

    @Override
    public boolean addCart(Cart cart) {
        return false;
    }

    @Override
    public boolean minusCart(Cart cart) {
        return false;
    }

    @Override
    public Cart[] viewCart(String userId) {
        return new Cart[0];
    }
}
