import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DoacaoMedulaComponent } from './doacao-medula.component';

describe('DoacaoMedulaComponent', () => {
  let component: DoacaoMedulaComponent;
  let fixture: ComponentFixture<DoacaoMedulaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DoacaoMedulaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DoacaoMedulaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
