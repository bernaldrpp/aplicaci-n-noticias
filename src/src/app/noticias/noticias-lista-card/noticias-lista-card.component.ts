import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Noticia } from '../noticia.model';

@Component({
  selector: 'app-noticias-lista-card',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './noticias-lista-card.component.html',
  styleUrl: './noticias-lista-card.component.css'
})
export class NoticiasListaCardComponent {
  @Input() noticia!: Noticia;
}
