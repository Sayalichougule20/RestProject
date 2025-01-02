import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-song',
  imports: [FormsModule,CommonModule],
  templateUrl: './song.component.html',
  styleUrl: './song.component.css'
})
export class SongComponent {

constructor(private router:Router){}

onMusic() {
  this.router.navigate(['/music'])
}

onPodcast() {
  this.router.navigate(['/podcast'])
}

onLikedlib() {
  this.router.navigate(['/likedlib'])
}

onArtist(){
  this.router.navigate(['/artist'])
}
}
