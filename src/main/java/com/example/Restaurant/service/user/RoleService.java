package com.example.Restaurant.service.user;

import com.example.Restaurant.model.user.ERole;
import com.example.Restaurant.model.user.Role;

import java.util.Optional;

public interface RoleService {

    Optional<Role> findByName(ERole name);

}
