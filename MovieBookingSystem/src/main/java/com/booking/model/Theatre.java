package com.booking.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Theatre")
public class Theatre {
	
	@Id
	@Column(name = "theatreId", unique = true, nullable = false)
	private Integer theatreId;
	
	@Column(name = "theatreName", nullable = false)
	private String theatreName;
	
	@OneToMany(mappedBy="theatre")
	private List<Screen> screens;
	
	@ManyToOne
	@JoinColumn(name="locationId")
	private Location location;
	
	@ManyToOne
	@JoinColumn(name="movThreatreScreenTimeId")
	private MovThreatreScreenTime movTheatreScreenTime;
	
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public MovThreatreScreenTime getMovTheatreScreenTime() {
		return movTheatreScreenTime;
	}
	public void setMovTheatreScreenTime(MovThreatreScreenTime movTheatreScreenTime) {
		this.movTheatreScreenTime = movTheatreScreenTime;
	}
	
	
	
}
