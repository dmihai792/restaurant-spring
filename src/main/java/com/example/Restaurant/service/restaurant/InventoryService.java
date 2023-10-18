package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {

    List<Inventory> getAllInventoryItems();

    Optional<Inventory> getInventoryItemById(Long id);

    Inventory saveInventoryItem(Inventory inventory);

    void deleteInventoryItem(Long id);

}
