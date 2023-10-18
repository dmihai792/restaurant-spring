package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Inventory;
import com.example.Restaurant.repository.restaurant.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getAllInventoryItems() {
        return inventoryRepository.findAll();
    }

    @Override
    public Optional<Inventory> getInventoryItemById(Long id) {
        return inventoryRepository.findById(id);
    }

    @Override
    public Inventory saveInventoryItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public void deleteInventoryItem(Long id) {

    }
}
