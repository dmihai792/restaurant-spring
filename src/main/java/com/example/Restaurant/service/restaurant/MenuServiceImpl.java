package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Menu;
import com.example.Restaurant.repository.restaurant.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenuItems() {
        return menuRepository.findAll();
    }

    @Override
    public Optional<Menu> getMenuItemById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public Menu saveMenuItem(Menu menuItem) {
        return menuRepository.save(menuItem);
    }

    @Override
    public void deleteMenuItem(Long id) {

    }

}
