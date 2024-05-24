package com.bernald.infile.test.server.dao;

import com.bernald.infile.test.server.entity.Categoria;
import com.bernald.infile.test.server.entity.Noticia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaDAO {
    List<Categoria> findAll();

    @Query(value = "SELECT DISTINCT n.* " +
            "FROM categoria_noticia cn " +
            "LEFT JOIN noticia n ON cn.id_noticia = n.id " +
            "WHERE cn.id_categoria = :idCategoria")
    List<Noticia> getNoticiasCategoria(@Param("idCategoria") int theId);
}
