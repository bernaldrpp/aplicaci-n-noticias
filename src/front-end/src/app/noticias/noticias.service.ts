import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Noticia } from './noticia.model';
import { catchError, map } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { Router } from '@angular/router';

import { environment } from "../../environments/environment.development";

const BACKEND_URL = environment.apiUrl + '/noticias/';

@Injectable({
  providedIn: 'root'
})
export class NoticiasService {

  noticias: Noticia[] = [];

  constructor(private http: HttpClient, private router: Router) { }

  fetchNoticias() {
    return this.http
      .get<Noticia[]>(BACKEND_URL, {
          responseType: 'json'
        })
        .subscribe((responseData)=> {
          this.noticias = responseData;
        });
  }

  fetchById(id: number) {
    return this.http.get<Noticia>(BACKEND_URL + id,{
      responseType: 'json'
    });
  }

  fetchRecomendadas(id: number){
    return this.http.get<Noticia[]>(BACKEND_URL + id + '/recomendadas',{
      responseType: 'json'
    });
  }
}
