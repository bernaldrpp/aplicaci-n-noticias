package com.bernald.infile.test.server.rest;

import com.bernald.infile.test.server.entity.Categoria;
import com.bernald.infile.test.server.entity.Noticia;
import com.bernald.infile.test.server.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaRestController {
    private CategoriaService categoriaService;

    public CategoriaRestController(CategoriaService theCategoriaService) {
        this.categoriaService = theCategoriaService;
    }

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }

    @GetMapping("/{categoriaId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Noticia> getNoticiasCategoria(@PathVariable int categoriaId){
        return categoriaService.getNoticiasCategoria(categoriaId);
    }
}
