package com.dh.aula_30.entity;

import com.dh.aula_30.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private LivroRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password1 = bCryptPasswordEncoder.encode("password1");
        String password2 = bCryptPasswordEncoder.encode("password2");

        userRepository.save( new LivroEntity(1, "Jose", "Castro", password1, AppUserRoles.ROLE_USER));
        userRepository.save( new LivroEntity(2, "Maria", "Castro", password2, AppUserRoles.ROLE_USER));
    }
}
