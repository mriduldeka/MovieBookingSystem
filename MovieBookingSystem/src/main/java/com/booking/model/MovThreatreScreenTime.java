package com.booking.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MovLocThreatreScreenTime")
public class MovThreatreScreenTime {
	
	@Id
	@Column(name = "movThreatreScreenTimeId", unique = true, nullable = false)
	private Integer movThreatreScreenTimeId;
	
	@OneToMany
	private  Set<Movie> movies;
	
	@OneToMany
	private Set<Theatre> theatres;
	
	@OneToMany
	private Set<Screen> screens;
	
	private Timestamp movieTime;
	
	public Timestamp getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(Timestamp movieTime) {
		this.movieTime = movieTime;
	}
	public Integer getMovThreatreScreenTimeId() {
		return movThreatreScreenTimeId;
	}
	public void setMovThreatreScreenTimeId(Integer movThreatreScreenTimeId) {
		this.movThreatreScreenTimeId = movThreatreScreenTimeId;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	public Set<Theatre> getTheatres() {
		return theatres;
	}
	public void setTheatres(Set<Theatre> theatres) {
		this.theatres = theatres;
	}
	public Set<Screen> getScreens() {
		return screens;
	}
	public void setScreens(Set<Screen> screens) {
		this.screens = screens;
	}
	
}
