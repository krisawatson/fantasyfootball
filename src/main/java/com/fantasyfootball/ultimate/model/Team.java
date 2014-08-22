package com.fantasyfootball.ultimate.model;

import com.google.gson.annotations.SerializedName;

public class Team {

	private String name;
	private int id;
	private int code;
	@SerializedName("short_name")
	private String shortName;
	private boolean unavailable;
	private String strength;
	@SerializedName("team_division")
	private int teamDivision;
	private int position;
	private int played;
	private int win;
	private int loss;
	private int draw;
	private int points;
	private String form;
	@SerializedName("current_event_fixture")
	private EventFixture currentEventFixture;
	@SerializedName("next_event_fixture")
	private EventFixture nextEventFixture;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public boolean isUnavailable() {
		return unavailable;
	}
	public void setUnavailable(boolean unavailable) {
		this.unavailable = unavailable;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public int getTeamDivision() {
		return teamDivision;
	}
	public void setTeamDivision(int teamDivision) {
		this.teamDivision = teamDivision;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public EventFixture getCurrentEventFixture() {
		return currentEventFixture;
	}
	public void setCurrentEventFixture(EventFixture currentEventFixture) {
		this.currentEventFixture = currentEventFixture;
	}
	public EventFixture getNextEventFixture() {
		return nextEventFixture;
	}
	public void setNextEventFixture(EventFixture nextEventFixture) {
		this.nextEventFixture = nextEventFixture;
	}
}
