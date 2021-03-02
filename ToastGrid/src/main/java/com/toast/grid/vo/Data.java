package com.toast.grid.vo;

import lombok.AllArgsConstructor;


public class Data {
	private String name;
	private String artist;
	private String type;
	private String release;
	private String genre;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Data(String name, String artist, String type, String release, String genre) {
		super();
		this.name = name;
		this.artist = artist;
		this.type = type;
		this.release = release;
		this.genre = genre;
	}
	
	
	
}
