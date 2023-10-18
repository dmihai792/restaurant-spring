package com.example.Restaurant.repository.user;

import com.example.Restaurant.model.user.ERole;
import com.example.Restaurant.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
