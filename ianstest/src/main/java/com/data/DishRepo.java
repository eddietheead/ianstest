package com.data;

import org.springframework.data.repository.CrudRepository;

import com.data.Dish;

public interface DishRepo extends CrudRepository<Dish, Long> {

}
