package com.example.Restaurant.service.user;

import com.example.Restaurant.model.user.ERole;
import com.example.Restaurant.model.user.Role;
import com.example.Restaurant.repository.user.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<Role> findByName(ERole name) {
        return roleRepository.findByName(name);
    }

}
