package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LikeLib {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int likeid;
	
	private String title;
	private String artist;
	
	public  LikeLib() {}

	public LikeLib(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}
	
	public int getLikeid() {
		return likeid;
	}

	public void setLikeid(int likeid) {
		this.likeid = likeid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "LikeLib [likeid=" + likeid + ", title=" + title + ", artist=" + artist + "]";
	}
	
	
}
