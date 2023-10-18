package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Inventory;
import com.example.Restaurant.model.restaurant.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    List<Menu> getAllMenuItems();

    Optional<Menu> getMenuItemById(Long id);

    Menu saveMenuItem(Menu menuItem);

    void deleteMenuItem(Long id);

}
