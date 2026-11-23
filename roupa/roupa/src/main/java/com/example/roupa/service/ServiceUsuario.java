package com.example.roupa.service;

import com.example.roupa.entity.EntidadeUsuario;
import com.example.roupa.repositorio.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUsuario {

    public final RepositorioUsuario repositorioUsuario;

    public ServiceUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    // devolve false se o email ja existe
    public boolean cadastrar(EntidadeUsuario usuario) {
        if (repositorioUsuario.findByEmail(usuario.getEmail()).isPresent()) {
            return false;
        }
        repositorioUsuario.save(usuario);
        return true;
    }

    // devolve true se achou o email e a senha confere
    public boolean login(String email, String senha) {
        Optional<EntidadeUsuario> usuario = repositorioUsuario.findByEmail(email);
        return usuario.isPresent() && usuario.get().getSenha().equals(senha);
    }
}