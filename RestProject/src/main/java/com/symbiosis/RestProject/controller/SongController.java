package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Song;
import com.symbiosis.RestProject.service.SongService;

@RestController
@RequestMapping("/api") // Base URL for this controller
public class SongController {
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    // Endpoint to get song details by Spotify song ID
    @GetMapping("/song/{id}")
    public ResponseEntity<String> getSong(@RequestHeader("Authorization") String accessToken, @PathVariable String id) {
        String songDetails = songService.getSongDetails(accessToken, id);
        return ResponseEntity.ok(songDetails);
    }
    
    @PostMapping("/song")
    public ResponseEntity<Song> addSong(@RequestBody Song song) {
        Song savedSong = songService.saveSong(song);
        return ResponseEntity.ok(savedSong);
    }
    
    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getAllSongs() {
        List<Song> songs = songService.getAllSongs();
        return ResponseEntity.ok(songs);
    }
    // You can add more endpoints here as needed
}