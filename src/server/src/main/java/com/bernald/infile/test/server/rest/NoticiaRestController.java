package com.bernald.infile.test.server.rest;

import com.bernald.infile.test.server.entity.Noticia;
import com.bernald.infile.test.server.service.NoticiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaRestController {

    private NoticiaService noticiaService;

    public NoticiaRestController(NoticiaService theNoticiaService) {
        this.noticiaService = theNoticiaService;
    }

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Noticia> findAll(){
        return noticiaService.findAll();
    }

    @GetMapping("/{noticiaId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Noticia findById(@PathVariable int noticiaId){
        Noticia theNoticia = noticiaService.findById(noticiaId);

        if(theNoticia == null){
            throw new RuntimeException("Noticia no encontrada - " + noticiaId);
        }

        return theNoticia;
    }

    @GetMapping("/{noticiaId}/recomendadas")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Noticia> getRecomendadas(@PathVariable int noticiaId){
        return noticiaService.getRecomendadas(noticiaId);
    }
}
