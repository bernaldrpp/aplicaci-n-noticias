import { Component, OnInit } from '@angular/core';
import { Noticia } from '../noticia.model';
import { CommonModule } from '@angular/common';
import { Observable, map } from 'rxjs';
import { NoticiasService } from '../noticias.service';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { NoticiasListaCardComponent } from '../noticias-lista-card/noticias-lista-card.component';
import { HeaderComponent } from '../../header/header.component';

@Component({
  selector: 'app-noticias-view',
  standalone: true,
  imports: [CommonModule, NoticiasListaCardComponent, HeaderComponent],
  templateUrl: './noticias-view.component.html',
  styleUrl: './noticias-view.component.css'
})
export class NoticiasViewComponent implements OnInit{
  noticia!: Noticia;
  recomendadas!: Noticia[];
  private idNoticia!: number;

  constructor(private noticiaService: NoticiasService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((paramMap: ParamMap) => {
      if (paramMap.has("idNoticia")) {
        this.idNoticia = Number(paramMap.get("idNoticia"));
        this.noticiaService.fetchById(this.idNoticia).subscribe(response => {
          this.noticia = response
        });

        this.noticiaService.fetchRecomendadas(this.idNoticia).subscribe(response =>{
          this.recomendadas = response;
        })
      }
    });
  }
}
