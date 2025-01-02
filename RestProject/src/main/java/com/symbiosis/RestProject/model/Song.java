package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Song {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Primary key

    private String songId; // Spotify song ID
    private String name; // Song name
    private String artist; // Artist name
    private String album; // Album name
    private String audioUrl; // URL to the audio file

    // Constructors
    public Song() {}

    public Song(String songId, String name, String artist, String album, String audioUrl) {
        this.songId = songId;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.audioUrl = audioUrl;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

	@Override
	public String toString() {
		return "Song [id=" + id + ", songId=" + songId + ", name=" + name + ", artist=" + artist + ", album=" + album
				+ ", audioUrl=" + audioUrl + "]";
	}
    
}