import { Routes } from '@angular/router';
import { NoticiasListaComponent } from './noticias/noticias-lista/noticias-lista.component';
import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { AuthGuard } from './auth/auth.guard';

export const routes: Routes = [
    {path: '', pathMatch: 'full', redirectTo:'list'},
    { path: "login", component: LoginComponent },
    { path: "signup", component: SignupComponent },
    {path: 'list', component: NoticiasListaComponent, canActivate: [AuthGuard] },
    {path: 'detalle/:idNoticia', loadComponent: () => import('./noticias/noticias-view/noticias-view.component').then(m => m.NoticiasViewComponent), canActivate: [AuthGuard] },
    
];
