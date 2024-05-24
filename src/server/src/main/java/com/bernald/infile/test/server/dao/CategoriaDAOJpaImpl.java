package com.bernald.infile.test.server.dao;

import com.bernald.infile.test.server.entity.Categoria;
import com.bernald.infile.test.server.entity.Noticia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaDAOJpaImpl implements CategoriaDAO{
    private EntityManager entityManager;

    @Autowired
    public CategoriaDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Categoria> findAll() {
        TypedQuery<Categoria> theQuery = entityManager.createQuery("from Categoria", Categoria.class);

        List<Categoria> categorias = theQuery.getResultList();

        return categorias;
    }

    @Override
    public List<Noticia> getNoticiasCategoria(int theId){
        Query theQuery = entityManager.createNativeQuery(
                "SELECT DISTINCT n.* " +
                        "FROM categoria_noticia cn " +
                        "LEFT JOIN noticia n ON cn.id_noticia = n.id " +
                        "WHERE cn.id_categoria = "+theId, Noticia.class);


        List<Noticia> noticias = theQuery.getResultList();

        return noticias;
    }
}
