package com.dh.aula_30.service.impl;

import com.dh.aula_30.dto.LivroDTO;
import com.dh.aula_30.entity.LivroEntity;
import com.dh.aula_30.repository.LivroRepository;
import com.dh.aula_30.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements UserDetailsService {

    //Spring faz os instanciamentos sozinho e deixa o codigo clean
    @Autowired
    private LivroRepository livroRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return livroRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Book not found!"));
    }
}
