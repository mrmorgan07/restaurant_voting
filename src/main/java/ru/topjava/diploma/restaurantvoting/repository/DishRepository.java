package ru.topjava.diploma.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.diploma.restaurantvoting.model.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {

}
