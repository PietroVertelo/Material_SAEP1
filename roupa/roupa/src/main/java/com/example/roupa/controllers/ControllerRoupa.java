package com.example.roupa.controllers;

import com.example.roupa.entity.EntidadeRoupa;
import com.example.roupa.service.ServiceRoupa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/roupa")


public class ControllerRoupa {

  public final ServiceRoupa serviceRoupa;

    public ControllerRoupa(ServiceRoupa serviceRoupa) {
        this.serviceRoupa = serviceRoupa;
    }

   @PostMapping
    public EntidadeRoupa salvar(@RequestBody EntidadeRoupa entidadeRoupa){
        return serviceRoupa.salvar(entidadeRoupa);
   }

   @GetMapping
    public List<EntidadeRoupa>listar(){
        return serviceRoupa.listar();
   }

   @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        serviceRoupa.deletar(id);
   }
}
