package ru.topjava.diploma.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.diploma.restaurantvoting.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
