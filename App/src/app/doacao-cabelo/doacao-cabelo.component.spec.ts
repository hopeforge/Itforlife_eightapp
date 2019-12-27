import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DoacaoCabeloComponent } from './doacao-cabelo.component';

describe('DoacaoCabeloComponent', () => {
  let component: DoacaoCabeloComponent;
  let fixture: ComponentFixture<DoacaoCabeloComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DoacaoCabeloComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DoacaoCabeloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
