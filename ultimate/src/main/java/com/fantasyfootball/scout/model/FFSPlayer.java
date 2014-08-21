package com.fantasyfootball.scout.model;

import java.io.Serializable;

public class FFSPlayer implements Serializable {
	private static final long serialVersionUID = -8411544128057575706L;
	
	private int id;
	private String name;
	private String team;
	private String position;
	private double price;
	private int mins;
	private double goals;
	private double assists;
	private double cleanSheets;
	private double bonus;
	private double yellowCards;
	private double fplPoints;
	private double value;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public double getGoals() {
		return goals;
	}
	public void setGoals(double goals) {
		this.goals = goals;
	}
	public double getAssists() {
		return assists;
	}
	public void setAssists(double assists) {
		this.assists = assists;
	}
	public double getCleanSheets() {
		return cleanSheets;
	}
	public void setCleanSheets(double cleanSheets) {
		this.cleanSheets = cleanSheets;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getYellowCards() {
		return yellowCards;
	}
	public void setYellowCards(double yellowCards) {
		this.yellowCards = yellowCards;
	}
	public double getFplPoints() {
		return fplPoints;
	}
	public void setFplPoints(double fplPoints) {
		this.fplPoints = fplPoints;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
