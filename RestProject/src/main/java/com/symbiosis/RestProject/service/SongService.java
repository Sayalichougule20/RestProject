package com.symbiosis.RestProject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.symbiosis.RestProject.model.Song;
import com.symbiosis.RestProject.repository.SongRepository;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

@Service
public class SongService {
    private final String SPOTIFY_API_URL = "https://api.spotify.com/v1";

    @Autowired
    private SongRepository songRepository;

    public String getSongDetails(String accessToken, String songId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = SPOTIFY_API_URL + "/tracks/" + songId;
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        
        // Here you can parse the response and save the song details to the database
        // For simplicity, let's assume you have a method to parse the response
        Song song = parseSongResponse(response.getBody());
        songRepository.save(song);
        
        return response.getBody();
    }

    private Song parseSongResponse(String responseBody) {
        // Implement your JSON parsing logic here to extract song details
        // For example, using a library like Jackson or Gson
        // Return a new Song object with the parsed details
        // This is a placeholder implementation
        return new Song("songId", "Song Name", "Artist Name", "Album Name", "Audio URL");
    }

    public Song saveSong(Song song) {
        return songRepository.save(song); // Save the song to the database
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll(); // Retrieve all songs from the database
    }

}