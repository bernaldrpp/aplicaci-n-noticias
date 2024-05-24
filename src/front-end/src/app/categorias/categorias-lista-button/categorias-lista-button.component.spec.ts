import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoriasListaButtonComponent } from './categorias-lista-button.component';

describe('CategoriasListaButtonComponent', () => {
  let component: CategoriasListaButtonComponent;
  let fixture: ComponentFixture<CategoriasListaButtonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CategoriasListaButtonComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CategoriasListaButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
