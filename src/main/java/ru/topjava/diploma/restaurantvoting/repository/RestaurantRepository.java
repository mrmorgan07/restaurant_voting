package ru.topjava.diploma.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.diploma.restaurantvoting.model.Dish;
import ru.topjava.diploma.restaurantvoting.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
