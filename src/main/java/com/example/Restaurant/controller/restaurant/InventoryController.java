package com.example.Restaurant.controller.restaurant;

import com.example.Restaurant.model.restaurant.Inventory;
import com.example.Restaurant.service.restaurant.InventoryServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Log4j2
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;

    @GetMapping("/items")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Inventory>> getAllInventoryItems() {
        log.info("Finding all of the items from the database");
        List<Inventory> inventoryItems = inventoryService.getAllInventoryItems();

        return ResponseEntity.ok(inventoryItems);
    }

    @GetMapping("/item/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Inventory> getInventoryItemById(@PathVariable Long id) {
        log.info("Finding item with id: {}", id);
        Optional<Inventory> inventoryItem = inventoryService.getInventoryItemById(id);

        return ResponseEntity.ok(inventoryItem.get());
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> saveItem(@RequestBody Inventory inventory) {
        inventory.setDateAdded(LocalDateTime.now());
        Inventory item = inventoryService.saveInventoryItem(inventory);

        log.info("Adding the following item to DB: {} ", item.getProductName());

        return ResponseEntity.ok(item.toString());
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteItem(@PathVariable Long id) {

        inventoryService.deleteInventoryItem(id);
        log.info("Deleting the following item from DB: {} ", id);

        return ResponseEntity.ok("Item with Id " + id + " Deleted");
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> updateItem(@PathVariable("id") Long id, @RequestBody Inventory updatedItem, BindingResult result) {

        Inventory item = inventoryService.getInventoryItemById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid inventory item id:" + id));

        if (result.hasErrors()) {
            item.setId(id);
        }

        item.setDescription(updatedItem.getDescription());
        item.setProductName(updatedItem.getProductName());
        item.setQuantity(updatedItem.getQuantity());
        item.setPriceOfAcquisition(updatedItem.getPriceOfAcquisition());
        item.setDateUpdated(LocalDateTime.now());

        inventoryService.saveInventoryItem(item);

        log.info("Successfully update item with id: {}", id);

        return ResponseEntity.ok(item);

    }
}
