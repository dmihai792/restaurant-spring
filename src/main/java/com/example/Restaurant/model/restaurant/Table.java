package com.example.Restaurant.model.restaurant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@jakarta.persistence.Table(name = "Restaurant-Table")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Long tableNumber;

    @NotBlank
    private Long numberOfSeats;

    @NotBlank
    private boolean availability;

}
