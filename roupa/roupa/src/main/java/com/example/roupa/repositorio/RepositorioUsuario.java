package com.example.roupa.repositorio;

import com.example.roupa.entity.EntidadeUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositorioUsuario extends JpaRepository<EntidadeUsuario, Long> {
    Optional<EntidadeUsuario> findByEmail(String email);
}