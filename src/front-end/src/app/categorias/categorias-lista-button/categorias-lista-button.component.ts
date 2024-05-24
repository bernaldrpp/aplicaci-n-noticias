import { Component, Input } from '@angular/core';
import { Categoria } from '../categoria.model';

import {MatButtonModule} from '@angular/material/button';
import { RouterModule } from '@angular/router';


@Component({
  selector: 'app-categorias-lista-button',
  standalone: true,
  imports: [MatButtonModule, RouterModule],
  templateUrl: './categorias-lista-button.component.html',
  styleUrl: './categorias-lista-button.component.css'
})
export class CategoriasListaButtonComponent {
  @Input() categoria!: Categoria;
}