package ru.topjava.diploma.restaurantvoting.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dish")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(callSuper = true)
public class Dish extends BaseEntity {

    @Column(name="name")
    @NotEmpty
    @Size(min = 3, max = 128)
    private String name;

    @Column(name="description")
    @NotEmpty
    @Size(min = 5, max = 500)
    private String description;

    @Column(name = "price", columnDefinition = "integer default 0")
    @Size(min = 1, max = 5)
    @NotEmpty
    private Integer dishPrice;

    // TODO add constructor with parameters
}
