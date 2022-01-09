package ru.topjava.diploma.restaurantvoting.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "Menu")
@Table(name = "restaurant_menu")
@Getter
@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Menu extends BaseEntity{

//    @EmbeddedId
//    private MenuId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    @ToString.Exclude
    private Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dish_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    @ToString.Exclude
    private Dish dish;

//    @Column(name = "restaurant_id")
//    private Integer restaurantId;
//
//    @Column(name = "dish_id")
//    private Integer dishId;

    @Column(name = "is_active", columnDefinition = "boolean default false")
    private Boolean isActual;

    @Column(name = "actual_dish_dt", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    @NotNull
    private Date ActualDishDate;

    public Menu(Restaurant restaurant, Dish dish) {
        this.restaurant = restaurant;
        this.dish = dish;
    }

    public Menu() {

    }
    // TODO add constructor with parameters
}
