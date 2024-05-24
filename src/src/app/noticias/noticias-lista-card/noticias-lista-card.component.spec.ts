import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoticiasListaCardComponent } from './noticias-lista-card.component';

describe('NoticiasListaCardComponent', () => {
  let component: NoticiasListaCardComponent;
  let fixture: ComponentFixture<NoticiasListaCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NoticiasListaCardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NoticiasListaCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
