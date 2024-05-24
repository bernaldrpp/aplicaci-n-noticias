package com.bernald.infile.test.server.dao;

import com.bernald.infile.test.server.entity.Noticia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoticiaDAO {
    List<Noticia> findAll();

    Noticia findById(int theId);

    @Query(value = "SELECT DISTINCT n.* " +
            "FROM categoria_noticia cn1 " +
            "LEFT JOIN categoria_noticia cn2" +
            "ON cn1.id_categoria = cn2.id_categoria " +
            "LEFT JOIN noticia n ON cn2.id_noticia = n.id " +
            "WHERE cn1.id_noticia = :id_noticia")
    List<Noticia> getRecomendadas(@Param("id_noticia") int theId);
}
