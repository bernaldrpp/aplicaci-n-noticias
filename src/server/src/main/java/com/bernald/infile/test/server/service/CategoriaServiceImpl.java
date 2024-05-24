package com.bernald.infile.test.server.service;

import com.bernald.infile.test.server.dao.CategoriaDAO;
import com.bernald.infile.test.server.entity.Categoria;
import com.bernald.infile.test.server.entity.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    private CategoriaDAO categoriaDAO;

    @Autowired
    public CategoriaServiceImpl(CategoriaDAO categoriaDAO) {
        this.categoriaDAO = categoriaDAO;
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaDAO.findAll();
    }

    @Override
    public List<Noticia> getNoticiasCategoria(int theId){ return categoriaDAO.getNoticiasCategoria(theId); };

}
