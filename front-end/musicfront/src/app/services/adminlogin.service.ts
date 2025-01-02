import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AdminLogin } from '../models/admin-login';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {
  private serverurl = "http://localhost:9009/admin"; // Your server URL

  constructor(private http: HttpClient) { }

  login(e:any,p:any):Observable<AdminLogin[]>
  {
    return this.http.get<AdminLogin[]>(this.serverurl+"/login/"+e+"/"+p)
  }
}
