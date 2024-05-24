package com.bernald.infile.test.server.dao;

import com.bernald.infile.test.server.entity.Noticia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoticiaDAOJpaImpl implements NoticiaDAO{
    private EntityManager entityManager;

    @Autowired
    public NoticiaDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Noticia> findAll() {

        TypedQuery<Noticia> theQuery = entityManager.createQuery("from Noticia", Noticia.class);

        List<Noticia> noticias = theQuery.getResultList();

        return noticias;
    }

    @Override
    public Noticia findById(int theId) {
        Noticia theNoticia = entityManager.find(Noticia.class, theId);

        return theNoticia;
    }

    @Override
    public List<Noticia> getRecomendadas(int theId) {
        Query theQuery = entityManager.createNativeQuery(
                "SELECT DISTINCT n.* " +
                        "FROM categoria_noticia cn1 " +
                        "LEFT JOIN categoria_noticia cn2 " +
                        "ON cn1.id_categoria = cn2.id_categoria " +
                        "LEFT JOIN noticia n ON cn2.id_noticia = n.id " +
                        "WHERE cn1.id_noticia = "+theId, Noticia.class);


        List<Noticia> recomendadas = theQuery.getResultList();

        return recomendadas.subList(0, 3);
    }

}
