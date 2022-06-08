package com.spring04.delivery.repository;

import com.spring04.delivery.model.Food;
import com.spring04.delivery.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByRestaurant(Restaurant restaurant);

}
