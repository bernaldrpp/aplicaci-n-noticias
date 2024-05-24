import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

import { environment } from "../../environments/environment.development";
import { Categoria } from './categoria.model';
import { Noticia } from '../noticias/noticia.model';

const BACKEND_URL = environment.apiUrl + '/categorias/';

@Injectable({
  providedIn: 'root'
})
export class CategoriasService {

  
  categorias: Categoria[] = [];

  constructor(private http: HttpClient, private router: Router) { }

  fetchCategorias() {
    return this.http
      .get<Categoria[]>(BACKEND_URL, {
          responseType: 'json'
        })
        .subscribe((responseData)=> {
          this.categorias = responseData;
        });
  }
  
  fechNoticiasCategoria(id: number){
    return this.http.get<Noticia[]>(BACKEND_URL + id,{
      responseType: 'json'
    });
  }
}
