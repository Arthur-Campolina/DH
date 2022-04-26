package com.arthurcampolina.ToDO.services;

import com.arthurcampolina.ToDO.dtos.UserDTO;
import com.arthurcampolina.ToDO.entities.User;
import com.arthurcampolina.ToDO.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import com.arthurcampolina.ToDO.repositories.UserRepository;


public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> findAll(Pageable page){
        Page<User> list = userRepository.findAll(page);
        return list.map(UserDTO::new);
    }

    @Transactional
    public UserDTO insert(UserDTO dto) {

        User entity = new User();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity = userRepository.save(entity);
        return new UserDTO(entity);
    }
}

