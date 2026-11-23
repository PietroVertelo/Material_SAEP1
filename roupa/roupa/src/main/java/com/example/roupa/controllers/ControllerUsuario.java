package com.example.roupa.controllers;

import com.example.roupa.entity.EntidadeUsuario;
import com.example.roupa.service.ServiceUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {

    public final ServiceUsuario serviceUsuario;

    public ControllerUsuario(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    @PostMapping("/cadastrar")
    public boolean cadastrar(@RequestBody EntidadeUsuario usuario) {
        return serviceUsuario.cadastrar(usuario);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody EntidadeUsuario usuario) {
        return serviceUsuario.login(usuario.getEmail(), usuario.getSenha());
    }
}