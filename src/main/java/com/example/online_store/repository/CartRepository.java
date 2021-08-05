package com.example.online_store.repository;

import com.example.online_store.entity.CartItem;
import com.example.online_store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<CartItem, Long> {

    public void deleteCartItemById(Long id);
}
