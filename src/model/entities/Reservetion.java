package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservetion {
	private Integer roomNumber;
	private Date checkIn;
	private Date CheckOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservetion(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		CheckOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	
	}
	public Date getCheckOut() {
		return CheckOut;

	}
	
	public long duration() {
		long diff = CheckOut.getTime() - checkIn.getTime();
	return	TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}
	public void updateDates(Date checkIn, Date CheckOut) {
		this.checkIn = checkIn;
		this.CheckOut = CheckOut;
		
	}
	@Override
	public String toString() {
		return "Room " 
				+ roomNumber
				+", check-in: "
				+ sdf.format(checkIn)
				+", check- out: "
				+ sdf.format(CheckOut)
				+", "
				+ duration()
				+ " nights";
	}
				
	}
	

