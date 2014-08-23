package com.fantasyfootball.ultimate.model;

import com.google.gson.annotations.SerializedName;

public class EventFixture {

	private int id;
	@SerializedName("is_home")
	private boolean isHome;
	private int month;
	@SerializedName("event_day")
	private int eventDay;
	private int day;
	private int opponent;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getIsHome() {
		return isHome;
	}
	public void setIsHome(boolean isHome) {
		this.isHome = isHome;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getEventDay() {
		return eventDay;
	}
	public void setEventDay(int eventDay) {
		this.eventDay = eventDay;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getOpponent() {
		return opponent;
	}
	public void setOpponent(int opponent) {
		this.opponent = opponent;
	}
}
