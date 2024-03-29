package com.dev.ferreteriaapi.repository;

import com.dev.ferreteriaapi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    Long countByUsername(String username);
    List<Usuario> findByEstado(Boolean estado);

}
