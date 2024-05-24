package com.bernald.infile.test.server.repositories;

import com.bernald.infile.test.server.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Integer> {
    Optional<Usuario> findByUsuario(String usuario);
}