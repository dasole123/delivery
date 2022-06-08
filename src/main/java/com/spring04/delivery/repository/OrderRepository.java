package com.spring04.delivery.repository;

import com.spring04.delivery.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}

