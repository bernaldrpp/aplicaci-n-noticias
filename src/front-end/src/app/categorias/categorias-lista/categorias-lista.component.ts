import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../header/header.component';
import { CommonModule } from '@angular/common';
import { CategoriasService } from '../categorias.service';
import { CategoriasListaButtonComponent } from '../categorias-lista-button/categorias-lista-button.component';

@Component({
  selector: 'app-categorias-lista',
  standalone: true,
  imports: [HeaderComponent, CommonModule, CategoriasListaButtonComponent],
  templateUrl: './categorias-lista.component.html',
  styleUrl: './categorias-lista.component.css'
})
export class CategoriasListaComponent implements OnInit{
  
  constructor(readonly categoriasService:CategoriasService){ }

  ngOnInit(): void {
    this.categoriasService.fetchCategorias();
  }
}
