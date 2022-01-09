package ru.topjava.diploma.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.diploma.restaurantvoting.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
