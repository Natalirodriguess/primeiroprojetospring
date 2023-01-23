package com.primeiroprojetospring.usuariodept.controllers;

import com.primeiroprojetospring.usuariodept.entities.Usuario;
import com.primeiroprojetospring.usuariodept.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario") //caminho onde a requisição será realizada e respondida
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> findAll(){
        List<Usuario> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id){
        Usuario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping()
    public Usuario insert (@RequestBody Usuario usuario){
        Usuario resultado = repository.save(usuario);
        return resultado;
    }

}