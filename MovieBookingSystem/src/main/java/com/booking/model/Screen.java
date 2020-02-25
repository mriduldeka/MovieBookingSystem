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
@Table(name="Screen")
public class Screen {
	
	@Id
	@Column(name = "screenId", unique = true, nullable = false)
	private Integer screenId;
	
	@Column(name = "screenName", nullable = false)
	private String screenName;
	
	@ManyToOne
	@JoinColumn(name="theatreId")
	private Theatre theatre;
	
	@OneToMany(mappedBy="screen")
	private List<Seats> seats;
	
	@ManyToOne
	@JoinColumn(name="movThreatreScreenTimeId")
	private MovThreatreScreenTime movTheatreScreenTime;
	
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public List<Seats> getSeats() {
		return seats;
	}
	public void setSeats(List<Seats> seats) {
		this.seats = seats;
	}
	public MovThreatreScreenTime getMovTheatreScreenTime() {
		return movTheatreScreenTime;
	}
	public void setMovTheatreScreenTime(MovThreatreScreenTime movTheatreScreenTime) {
		this.movTheatreScreenTime = movTheatreScreenTime;
	}
	
	
}
