package com.spring04.delivery.controller;

import com.spring04.delivery.dto.FoodRequestDto;
import com.spring04.delivery.model.Food;
import com.spring04.delivery.repository.FoodRepository;
import com.spring04.delivery.repository.RestaurantRepository;
import com.spring04.delivery.service.FoodService;
import com.spring04.delivery.validator.FoodValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class FoodController {
    private final FoodService foodservice;

    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> getFoods(@PathVariable Long restaurantId){
        List<Food> foods = foodservice.getFoods(restaurantId);
        return foods;
    }

    @PostMapping("restaurant/{restaurantId}/food/register")
    public void createFoods(@RequestBody List<FoodRequestDto> requestDtoList, @PathVariable Long restaurantId){
        FoodValidator.validateFoodInput(requestDtoList);
        foodservice.createFoods(requestDtoList, restaurantId);
    }
}
