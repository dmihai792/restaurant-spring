package com.example.Restaurant.model.restaurant;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String instructions;

    private List<Inventory> ingredients;

}
