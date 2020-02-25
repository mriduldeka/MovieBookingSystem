package com.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Seats")
public class Seats {
	
	@Id
	@Column(name = "seatId", unique = true, nullable = false)
	private Integer seatId;
	
	@Column(name = "seatNo", unique = true, nullable = false)
	private Integer seatNo;
	
	@ManyToOne
	@JoinColumn(name="screenId")
	private Screen screen;
	
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Integer getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	

}
