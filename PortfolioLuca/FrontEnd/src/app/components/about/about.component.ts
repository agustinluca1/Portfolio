import { Component, OnInit } from '@angular/core';
import { About } from 'src/app/model/about';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';
import { SAboutService } from 'src/app/service/s-about.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  persona: persona = new persona("","","");
  about: About[] = [];

  constructor(public personaService: PersonaService, private sAbout: SAboutService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona = data})

    this.cargarAbout();
    if(this.tokenService.getToken()){
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarAbout(): void{
    this.sAbout.lista().subscribe(data => {this.about = data;})
  }

}
