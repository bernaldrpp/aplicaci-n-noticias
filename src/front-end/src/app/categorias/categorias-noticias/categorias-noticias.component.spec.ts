import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoriasNoticiasComponent } from './categorias-noticias.component';

describe('CategoriasNoticiasComponent', () => {
  let component: CategoriasNoticiasComponent;
  let fixture: ComponentFixture<CategoriasNoticiasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CategoriasNoticiasComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CategoriasNoticiasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
