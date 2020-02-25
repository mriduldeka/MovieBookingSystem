package com.booking.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name="Movie")
public class Movie {
	
	@Id
	@Column(name = "movieId", unique = true, nullable = false)
	private Integer movieId;
	
	@Column(name = "movieName" , nullable = false, length = 100)
	private String movieName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Movie_Loc", joinColumns={@JoinColumn(referencedColumnName="movieid")},
               inverseJoinColumns={@JoinColumn(referencedColumnName="locid")}) 
	private Set<Location> locations;
	
	@ManyToOne
	@JoinColumn(name="movThreatreScreenTimeId")
	private MovThreatreScreenTime movTheatreScreenTime;
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Set<Location> getLocations() {
		return locations;
	}
	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}
	public MovThreatreScreenTime getMovTheatreScreenTime() {
		return movTheatreScreenTime;
	}
	public void setMovTheatreScreenTime(MovThreatreScreenTime movTheatreScreenTime) {
		this.movTheatreScreenTime = movTheatreScreenTime;
	}
}
