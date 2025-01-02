import { Component } from '@angular/core';
import { AdminLogin } from '../models/admin-login';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AdminLoginService } from '../services/adminlogin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  imports: [FormsModule,CommonModule],
  templateUrl: './adminlogin.component.html',
  styleUrl: './adminlogin.component.css'
})
export class AdminloginComponent {
adm:AdminLogin=new AdminLogin()

constructor(private admserv:AdminLoginService ,private router:Router)
{

}
submitdata()
{
  this.admserv.login(this.adm.email,this.adm.password).subscribe(data=>{
    if(data.length>0)
    {
      alert("login successful")
      localStorage.setItem("usertype","admin")
      this.router.navigate(["/"])
    }
    else
    {
      alert("Invalid email or password")
    }
})
}
}
