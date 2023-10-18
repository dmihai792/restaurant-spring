package com.example.Restaurant.model.restaurant;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String productName;

    private String description;

    private Long quantity;

    private Long priceOfAcquisition;

    private LocalDateTime dateAdded;

    private LocalDateTime dateUpdated;
}
