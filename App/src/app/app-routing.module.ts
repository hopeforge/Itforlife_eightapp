import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { AdocaoComponent } from './adocao/adocao.component';
import { DoacoesComponent } from './doacoes/doacoes.component';
import { EventosComponent } from './eventos/eventos.component';
import { LoginComponent } from './login/login.component';
import { DoacaoCabeloComponent } from './doacao-cabelo/doacao-cabelo.component';
import { DoacaoMedulaComponent } from './doacao-medula/doacao-medula.component';
import { DoacaoSangueComponent } from './doacao-sangue/doacao-sangue.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'doacao-cabelo', component: DoacaoCabeloComponent },
  { path: 'doacao-medula', component: DoacaoMedulaComponent },
  { path: 'doacao-sangue', component: DoacaoSangueComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'doacoes', component: DoacoesComponent },
  { path: 'eventos', component: EventosComponent },
  { path: 'login', component: LoginComponent },
  { path: 'adocao', component: AdocaoComponent },
  { path: '**', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
