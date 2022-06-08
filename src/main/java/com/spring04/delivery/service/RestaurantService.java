package com.spring04.delivery.service;


import com.spring04.delivery.dto.RestaurantRequestDto;
import com.spring04.delivery.model.Restaurant;
import com.spring04.delivery.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service

public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

//    @Autowired
//    public RestaurantService(RestaurantRepository restaurantRepository){
//        this.restaurantRepository = restaurantRepository;
//    }


    @Transactional
    public Restaurant createRestaurant(RestaurantRequestDto requestDto){
        Restaurant restaurant = new Restaurant(requestDto);
        restaurantRepository.save(restaurant);

        return restaurant;
    }

    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }

//    public Long deleteRestaurant(Long restaurantId) {
//        restaurantRepository.deleteById(restaurantId);
//        return restaurantId;
//    }
}