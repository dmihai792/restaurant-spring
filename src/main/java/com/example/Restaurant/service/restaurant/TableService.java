package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Menu;
import com.example.Restaurant.model.restaurant.Table;

import java.util.List;
import java.util.Optional;

public interface TableService {

    List<Table> getAllTables();

    Optional<Table> getTableById(Long id);

    Table saveTable(Table table);

    void deleteTable(Long id);

}
