package ru.topjava.diploma.restaurantvoting;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.topjava.diploma.restaurantvoting.repository.DishRepository;
import ru.topjava.diploma.restaurantvoting.repository.MenuRepository;
import ru.topjava.diploma.restaurantvoting.repository.RestaurantRepository;
import ru.topjava.diploma.restaurantvoting.repository.UserRepository;

@SpringBootApplication
@AllArgsConstructor
public class RestaurantVotingApplication implements ApplicationRunner {
    private final UserRepository userRepository;
    private final DishRepository dishRepository;
    private final RestaurantRepository restaurantRepository;
    private final MenuRepository menuRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("User List:");
        System.out.println(userRepository.findAll());
        System.out.println("");
        System.out.println("Dish List");
        System.out.println(dishRepository.findAll());
        System.out.println("");
        System.out.println("Restaurant List");
        System.out.println(restaurantRepository.findAll());
        System.out.println("");
        System.out.println("Menu List");
        System.out.println(menuRepository.findAll());
    }
}