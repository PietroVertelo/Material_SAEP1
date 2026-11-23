package com.example.roupa.repositorio;

import com.example.roupa.entity.EntidadeRoupa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioRoupa extends JpaRepository <EntidadeRoupa, Long> {
    List<EntidadeRoupa> id(Long id);
}
