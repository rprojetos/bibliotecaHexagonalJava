package com.exemplo.biblioteca.infra.repository;

import com.exemplo.biblioteca.infra.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroJpaRepository extends JpaRepository<LivroEntity, String> {
    Optional<LivroEntity> findByTitulo(String titulo);
}
