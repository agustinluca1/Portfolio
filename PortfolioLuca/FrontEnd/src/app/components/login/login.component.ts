import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  form:FormGroup;
  constructor(private formBuilder:FormBuilder) {
    this.form = this.formBuilder.group(
      {
        email:['',[Validators.required,Validators.email]],
        password:['',[Validators.required, Validators.minLength(8)]],
      }
    )
   }

  ngOnInit(): void {
  }

  get Email(){
    return this.form.get('email');
  }

  get Pass(){
    return this.form.get('password');
  }
}
