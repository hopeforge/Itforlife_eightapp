import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { DoacoesComponent } from './doacoes/doacoes.component';
import { HomeComponent } from './home/home.component';
import { AdocaoComponent } from './adocao/adocao.component';
import { DoacaoCabeloComponent } from './doacao-cabelo/doacao-cabelo.component';
import { DoacaoMedulaComponent } from './doacao-medula/doacao-medula.component';
import { DoacaoSangueComponent } from './doacao-sangue/doacao-sangue.component';
import { EventosComponent } from './eventos/eventos.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    DoacoesComponent,
    HomeComponent,
    AdocaoComponent,
    DoacaoCabeloComponent,
    DoacaoMedulaComponent,
    DoacaoSangueComponent,
    EventosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
