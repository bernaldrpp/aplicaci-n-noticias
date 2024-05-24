import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Noticia } from '../noticia.model';

import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';

@Component({
  selector: 'app-noticias-lista-card',
  standalone: true,
  imports: [CommonModule, RouterModule, MatButtonModule, MatCardModule],
  templateUrl: './noticias-lista-card.component.html',
  styleUrl: './noticias-lista-card.component.css'
})
export class NoticiasListaCardComponent {
  @Input() noticia!: Noticia;
}
