// src/app/song.model.ts
export interface Song {
    id?: number; // Optional for new songs
    songId: string;
    name: string;
    artist: string;
    album: string;
    audioUrl: string;
  }