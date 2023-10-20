package com.example.Restaurant.model.restaurant;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String name;

    private String description;

    @NotBlank
    private Long rawPrice;

    @NotBlank
    private Long sellingPrice;

    @NotBlank
    private Long markUp;

    private Long recipeId;

}
