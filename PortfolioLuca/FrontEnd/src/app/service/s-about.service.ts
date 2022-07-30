import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { About } from '../model/about';

@Injectable({
  providedIn: 'root'
})
export class SAboutService {
  abURL = 'https://backendportfolioluca.herokuapp.com/about/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<About[]>{
    return this.httpClient.get<About[]>(this.abURL + 'lista');
  }

  public detail(id: number): Observable<About>{
    return this.httpClient.get<About>(this.abURL + `detail/${id}`)
  }

  public update(id: number, about: About): Observable<any>{
    return this.httpClient.put<any>(this.abURL + `update/${id}`, about);
  }

}
