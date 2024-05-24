import { Component, OnInit } from '@angular/core';
import { Noticia } from '../../noticias/noticia.model';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { CategoriasService } from '../categorias.service';
import { HeaderComponent } from '../../header/header.component';
import { NoticiasListaCardComponent } from '../../noticias/noticias-lista-card/noticias-lista-card.component';
import { CommonModule } from '@angular/common';

import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-categorias-noticias',
  standalone: true,
  imports: [HeaderComponent, NoticiasListaCardComponent, CommonModule, MatIconModule, MatButtonModule],
  templateUrl: './categorias-noticias.component.html',
  styleUrl: './categorias-noticias.component.css'
})
export class CategoriasNoticiasComponent implements OnInit{
  noticias!: Noticia[];
  private idCategoria!: number;

  constructor(private categoriasService: CategoriasService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((paramMap: ParamMap) => {
      if (paramMap.has("idCategoria")) {
        this.idCategoria = Number(paramMap.get("idCategoria"));

        this.categoriasService.fechNoticiasCategoria(this.idCategoria).subscribe(response =>{
          console.log(response);
          this.noticias = response;
        })
      }
    });
  }
}
