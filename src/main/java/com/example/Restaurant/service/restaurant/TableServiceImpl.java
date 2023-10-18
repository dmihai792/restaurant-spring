package com.example.Restaurant.service.restaurant;

import com.example.Restaurant.model.restaurant.Table;
import com.example.Restaurant.repository.restaurant.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;

    @Override
    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    @Override
    public Optional<Table> getTableById(Long id) {
        return tableRepository.findById(id);
    }

    @Override
    public Table saveTable(Table table) {
        return tableRepository.save(table);
    }

    @Override
    public void deleteTable(Long id) {

    }

}
