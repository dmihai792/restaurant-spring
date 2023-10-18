package com.example.Restaurant.repository.restaurant;

import com.example.Restaurant.model.restaurant.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {

}
