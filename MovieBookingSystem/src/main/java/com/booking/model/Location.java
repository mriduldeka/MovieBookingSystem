package com.booking.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
	
	@Id
	@Column(name = "locId", unique = true, nullable = false)
	private Integer locationId;
	
	@Column(name = "locName" , nullable = false, length = 100)
	private String locationName;
	
	@ManyToMany(mappedBy="locations")
	private Set<Movie> movies;
	
	@OneToMany(mappedBy="location")
	private Set<Theatre> theatre;
	
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	public Set<Theatre> getTheatre() {
		return theatre;
	}
	public void setTheatre(Set<Theatre> theatre) {
		this.theatre = theatre;
	}
	
}
