package com.dh.aula_30.repository;

import com.dh.aula_30.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional //trabalha dentro de uma transação no banco de dados
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    Optional<LivroEntity> findByEmail(String email);
}
