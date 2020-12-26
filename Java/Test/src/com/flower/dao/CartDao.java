package com.flower.dao;

import com.flower.entity.Cart;

public interface CartDao {
    boolean addCart(Cart cart);

    boolean minusCart(Cart cart);

    Cart[] viewCart(String userId);
}
