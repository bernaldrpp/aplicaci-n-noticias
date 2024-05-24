package com.bernald.infile.test.server.service;


import com.bernald.infile.test.server.entity.Noticia;

import java.util.List;

public interface NoticiaService {

    List<Noticia> findAll();

    Noticia findById(int theId);

    List<Noticia> getRecomendadas(int theId);
}
