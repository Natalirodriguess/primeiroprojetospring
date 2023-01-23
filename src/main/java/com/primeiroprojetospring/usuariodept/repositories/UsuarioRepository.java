package com.primeiroprojetospring.usuariodept.repositories;

import com.primeiroprojetospring.usuariodept.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {


}