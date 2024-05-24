package com.bernald.infile.test.server.service;

import com.bernald.infile.test.server.dao.NoticiaDAO;
import com.bernald.infile.test.server.entity.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl  implements NoticiaService{
    private NoticiaDAO noticiaDAO;

    @Autowired
    public NoticiaServiceImpl(NoticiaDAO noticiaDAO) {
        this.noticiaDAO = noticiaDAO;
    }

    @Override
    public List<Noticia> findAll() {
        return noticiaDAO.findAll();
    }

    @Override
    public Noticia findById(int theId) {
        return noticiaDAO.findById(theId);
    }

    @Override
    public List<Noticia> getRecomendadas(int theId) {
        return noticiaDAO.getRecomendadas(theId);
    }
}
