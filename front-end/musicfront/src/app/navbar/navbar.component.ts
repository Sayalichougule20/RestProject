import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Router } from '@angular/router'; // Import Router

@Component({
  selector: 'app-navbar',
  imports: [RouterLink, CommonModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent implements OnInit{
  
  menutype="guest"
  constructor(private router:Router)
  {
    
  }
  ngOnInit(): void {
  this.router.events.subscribe((val:any)=>{
  if(val.url)
  {
  let ut=localStorage.getItem("usertype")
  if(ut=="user") //Jar user ne login kel asel tr
   this.menutype="user" // user la user cha interface dishnar
  else if(ut=="admin")
    this.menutype="admin" // admin la admin cha interface dishnar
  else
    this.menutype="guest" //otherwise guest cha
  }
  })
}


logout()
{
  localStorage.removeItem("emailid")
  localStorage.setItem("usertype","guest")
  this.router.navigate(["/"])

}

alogout()
{
  localStorage.removeItem("emailid")
  localStorage.setItem("usertype","guest")
  this.router.navigate(["/"])

}
}
