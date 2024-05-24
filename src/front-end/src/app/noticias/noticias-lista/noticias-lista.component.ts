import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { NoticiasListaCardComponent } from '../noticias-lista-card/noticias-lista-card.component';
import { NoticiasService } from '../noticias.service';
import { HeaderComponent } from '../../header/header.component';

@Component({
  selector: 'app-noticias-lista',
  standalone: true,
  imports: [CommonModule, NoticiasListaCardComponent, HeaderComponent],
  templateUrl: './noticias-lista.component.html',
  styleUrl: './noticias-lista.component.css'
})
export class NoticiasListaComponent implements OnInit{
  
  constructor(readonly noticiasService:NoticiasService){ }

  ngOnInit(): void {
    this.noticiasService.fetchNoticias();
  }
}
