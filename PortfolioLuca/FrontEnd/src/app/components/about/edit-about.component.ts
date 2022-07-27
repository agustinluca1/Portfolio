import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { About } from 'src/app/model/about';
import { SAboutService } from 'src/app/service/s-about.service';

@Component({
  selector: 'app-edit-about',
  templateUrl: './edit-about.component.html',
  styleUrls: ['./edit-about.component.css']
})
export class EditAboutComponent implements OnInit {
  abou: About = null;

  constructor(private sAbout: SAboutService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAbout.detail(id).subscribe( data =>{
      this.abou = data;
    }, err =>{
      alert("Error al modificar acerca de");
      this.router.navigate(['']);
    })
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAbout.update(id, this.abou).subscribe( data => {
      alert("Acerca de modificado con exito")
      this.router.navigate(['']);
    }, err =>{
      alert("Error al modificar acerca de");
      this.router.navigate(['']);
    })
  }
}
