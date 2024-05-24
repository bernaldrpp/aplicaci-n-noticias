import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { AuthService } from '../auth.service';
import { CommonModule } from '@angular/common';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from '../../header/header.component';

@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, HeaderComponent],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent implements OnInit, OnDestroy {
  isLoading = false;
  private authStatusSub!: Subscription;

  registerForm = new FormGroup({
    usuario: new FormControl(''),
    pass: new FormControl(''),
  })

  constructor(public authService: AuthService) {}

  ngOnInit() {
    this.authStatusSub = this.authService.getAuthStatusListener().subscribe(
      authStatus => {
        this.isLoading = false;
      }
    );
  }

  onSignup() {
    if (this.registerForm.invalid) {
      return;
    }
    this.isLoading = true;
    this.authService.createUser(this.registerForm.value.usuario ?? '', this.registerForm.value.pass ?? '');
  }

  ngOnDestroy() {
    this.authStatusSub.unsubscribe();
  }
}
