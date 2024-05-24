package com.bernald.infile.test.server.service;

import com.bernald.infile.test.server.entity.Categoria;
import com.bernald.infile.test.server.entity.Noticia;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findAll();

    List<Noticia> getNoticiasCategoria(int theId);
}
