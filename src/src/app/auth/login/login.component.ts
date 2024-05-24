import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from "rxjs";
import { AuthService } from '../auth.service';
import { CommonModule } from '@angular/common';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from '../../header/header.component';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, HeaderComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit, OnDestroy {
  
  isLoading = false;
  private authStatus$!: Subscription;

  applyForm = new FormGroup({
    usuario: new FormControl(''),
    pass: new FormControl(''),
  })

  constructor(public authService: AuthService) {
    
  }

  ngOnInit() {
    this.authStatus$ = this.authService.getAuthStatusListener().subscribe(
      authStatus => {
        this.isLoading = false;
      }
    );
  }

  onLogin() {
    if (this.applyForm.invalid) {
      return;
    }
    this.isLoading = true;
    this.authService.login(this.applyForm.value.usuario ?? '', this.applyForm.value.pass ?? '');
  }

  ngOnDestroy() {
    this.authStatus$.unsubscribe();
  }
}
