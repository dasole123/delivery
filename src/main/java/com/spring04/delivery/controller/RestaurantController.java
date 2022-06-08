package com.spring04.delivery.controller;


import com.spring04.delivery.dto.RestaurantRequestDto;
import com.spring04.delivery.model.Restaurant;
import com.spring04.delivery.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @PostMapping("/restaurant/register")
    public Restaurant createRestaurant(@RequestBody RestaurantRequestDto requestDto){
        Restaurant restaurant = restaurantService.createRestaurant(requestDto);
        return restaurant;
    }

//    @DeleteMapping("/restaurant/{restaurantId}")
//    public Long deleteRestaurant(@PathVariable Long restaurantId){
//        Long deletedId = restaurantService.deleteRestaurant(restaurantId);
//        return deletedId;
//    }

}