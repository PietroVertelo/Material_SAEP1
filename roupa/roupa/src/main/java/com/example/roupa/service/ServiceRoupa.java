package com.example.roupa.service;

import com.example.roupa.entity.EntidadeRoupa;
import com.example.roupa.repositorio.RepositorioRoupa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

//  //construtor
//    public ServiceMusica(Repositorio repositorio) {
//        this.repositorio = repositorio;
//    }
//
//   //metodo salvar
//   {
//
//        return repositorio.save(entidade);
//    }
//    //metodo listar
//    public List<Entidade> listarMusica(){
//        return repositorio.findAll();
//    }
//
//
//    //metodo deletar
//    public void deletarMusicias(Long id){
//        repositorio.deleteById(id);
//    }
//
//
//}

public class ServiceRoupa {

public final RepositorioRoupa repositorioRoupa;

    public ServiceRoupa(RepositorioRoupa repositorioRoupa) {
        this.repositorioRoupa = repositorioRoupa;
    }

    

    public EntidadeRoupa salvar(EntidadeRoupa entidadeRoupa){

        return repositorioRoupa.save(entidadeRoupa);
    }

    public List<EntidadeRoupa>listar(){
        return  repositorioRoupa.findAll();
    }

    public void deletar( Long id){
        repositorioRoupa.deleteById(id);
    }
}
