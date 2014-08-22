package com.fantasyfootball.ultimate.model;

import org.json.JSONObject;

import com.google.gson.annotations.SerializedName;

public class Player extends JSONObject{
	@SerializedName("big_chances_missed")
	private int bigChancesMissed;
	@SerializedName("selected_by_percent")
	private double selectedByPercent;
	@SerializedName("transfers_in")
	private int transfersIn;
	@SerializedName("cost_change_event")
	private int costChangeEvent;
	@SerializedName("first_name")
	private String firstName;
	@SerializedName("second_name")
	private String secondName;
	@SerializedName("transfers_in_event")
	private int transfersInEvent;
	@SerializedName("ea_index")
	private int eaIndex;
	@SerializedName("chance_of_playing_next_round")
	private int chanceOfPlayingNextRound;
	@SerializedName("penalities_missed")
	private int penaltiesMissed;
	@SerializedName("red_cards")
	private int redCards;
	@SerializedName("assists")
	private int assists;
	@SerializedName("cost_change_start")
	private int costChangeStart;
	@SerializedName("form")
	private double form;
	@SerializedName("yellow_cards")
	private int yellowCards;
	@SerializedName("status")
	private String status;
	@SerializedName("team")
	private int team;
	@SerializedName("code")
	private int code;
	@SerializedName("element_type")
	private int elementType;
	@SerializedName("event_points")
	private int eventPoints;
	@SerializedName("clean_sheets")
	private int cleanSheets;
	@SerializedName("saves")
	private int saves;
	@SerializedName("cost_change_start_fall")
	private int costChangeStartFall;
	@SerializedName("penalties_saved")
	private int penaltiesSaved;
	@SerializedName("own_goals")
	private int ownGoals;
	@SerializedName("cost_change_end_fall")
	private int costChangeEndFall;
	@SerializedName("now_cost")
	private int nowCost;
	@SerializedName("open_play_crosses")
	private int openPlayCrosses;
	@SerializedName("value_form")
	private double valueForm;
	@SerializedName("penalties_conceded")
	private int penaltiesConceded;
	@SerializedName("value_season")
	private double valueSeason;
	@SerializedName("in_dreamteam")
	private boolean inDreamteam;
	@SerializedName("id")
	private int playerId;
	@SerializedName("web_name")
	private String webName;
	@SerializedName("clearances_blocks_interceptions")
	private int clearancesBlocksInterceptions;
	@SerializedName("ep_next")
	private double epNext;
	@SerializedName("total_points")
	private int totalPoints;
	@SerializedName("goals_conceded")
	private int goalsConceded;
	@SerializedName("points_per_game")
	private double pointsPerGame;
	@SerializedName("recoveries")
	private int recoveries;
	@SerializedName("under_21")
	private boolean under21;
	@SerializedName("transfers_out")
	private int transfersOut;
	@SerializedName("chance_of_playing_this_round")
	private Integer chanceOfPlayingThisRound;
	@SerializedName("minutes")
	private int minutes;
	@SerializedName("news")
	private String news;
	@SerializedName("ep_this")
	private double epThis;
	@SerializedName("transfers_out_event")
	private int transfersOutEvent;
	@SerializedName("photo")
	private String photo;
	@SerializedName("errors_leading_to_goal")
	private int errorsLeadingToGoal;
	@SerializedName("goals_scored")
	private int goalsScored;
	@SerializedName("big_chances_created")
	private int bigChancesCreated;
	@SerializedName("special")
	private boolean special;
	@SerializedName("key_passes")
	private int keyPasses;
	@SerializedName("dreamteam_count")
	private int dreamteamCount;
	
	public int getBigChancesMissed() {
		return bigChancesMissed;
	}
	public void setBigChancesMissed(int bigChancesMissed) {
		this.bigChancesMissed = bigChancesMissed;
	}
	public double getSelectedByPercent() {
		return selectedByPercent;
	}
	public void setSelectedByPercent(double selectedByPercent) {
		this.selectedByPercent = selectedByPercent;
	}
	public int getTransfersIn() {
		return transfersIn;
	}
	public void setTransfersIn(int transfersIn) {
		this.transfersIn = transfersIn;
	}
	public int getCostChangeEvent() {
		return costChangeEvent;
	}
	public void setCostChangeEvent(int costChangeEvent) {
		this.costChangeEvent = costChangeEvent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getTransfersInEvent() {
		return transfersInEvent;
	}
	public void setTransfersInEvent(int transfersInEvent) {
		this.transfersInEvent = transfersInEvent;
	}
	public int getEaIndex() {
		return eaIndex;
	}
	public void setEaIndex(int eaIndex) {
		this.eaIndex = eaIndex;
	}
	public int getChanceOfPlayingNextRound() {
		return chanceOfPlayingNextRound;
	}
	public void setChanceOfPlayingNextRound(int chanceOfPlayingNextRound) {
		this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
	}
	public int getPenaltiesMissed() {
		return penaltiesMissed;
	}
	public void setPenaltiesMissed(int penaltiesMissed) {
		this.penaltiesMissed = penaltiesMissed;
	}
	public int getRedCards() {
		return redCards;
	}
	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getCostChangeStart() {
		return costChangeStart;
	}
	public void setCostChangeStart(int costChangeStart) {
		this.costChangeStart = costChangeStart;
	}
	public double getForm() {
		return form;
	}
	public void setForm(double form) {
		this.form = form;
	}
	public int getYellowCards() {
		return yellowCards;
	}
	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getElementType() {
		return elementType;
	}
	public void setElementType(int elementType) {
		this.elementType = elementType;
	}
	public int getEventPoints() {
		return eventPoints;
	}
	public void setEventPoints(int eventPoints) {
		this.eventPoints = eventPoints;
	}
	public int getCleanSheets() {
		return cleanSheets;
	}
	public void setCleanSheets(int cleanSheets) {
		this.cleanSheets = cleanSheets;
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	public int getCostChangeStartFall() {
		return costChangeStartFall;
	}
	public void setCostChangeStartFall(int costChangeStartFall) {
		this.costChangeStartFall = costChangeStartFall;
	}
	public int getPenaltiesSaved() {
		return penaltiesSaved;
	}
	public void setPenaltiesSaved(int penaltiesSaved) {
		this.penaltiesSaved = penaltiesSaved;
	}
	public int getOwnGoals() {
		return ownGoals;
	}
	public void setOwnGoals(int ownGoals) {
		this.ownGoals = ownGoals;
	}
	public int getCostChangeEndFall() {
		return costChangeEndFall;
	}
	public void setCostChangeEndFall(int costChangeEndFall) {
		this.costChangeEndFall = costChangeEndFall;
	}
	public int getNowCost() {
		return nowCost;
	}
	public void setNowCost(int nowCost) {
		this.nowCost = nowCost;
	}
	public int getOpenPlayCrosses() {
		return openPlayCrosses;
	}
	public void setOpenPlayCrosses(int openPlayCrosses) {
		this.openPlayCrosses = openPlayCrosses;
	}
	public double getValueForm() {
		return valueForm;
	}
	public void setValueForm(double valueForm) {
		this.valueForm = valueForm;
	}
	public int getPenaltiesConceded() {
		return penaltiesConceded;
	}
	public void setPenaltiesConceded(int penaltiesConceded) {
		this.penaltiesConceded = penaltiesConceded;
	}
	public double getValueSeason() {
		return valueSeason;
	}
	public void setValueSeason(double valueSeason) {
		this.valueSeason = valueSeason;
	}
	public boolean isInDreamteam() {
		return inDreamteam;
	}
	public void setInDreamteam(boolean inDreamteam) {
		this.inDreamteam = inDreamteam;
	}
	public String getWebName() {
		return webName;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public int getClearancesBlocksInterceptions() {
		return clearancesBlocksInterceptions;
	}
	public void setClearancesBlocksInterceptions(int clearancesBlocksInterceptions) {
		this.clearancesBlocksInterceptions = clearancesBlocksInterceptions;
	}
	public double getEpNext() {
		return epNext;
	}
	public void setEpNext(double epNext) {
		this.epNext = epNext;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getGoalsConceded() {
		return goalsConceded;
	}
	public void setGoalsConceded(int goalsConceded) {
		this.goalsConceded = goalsConceded;
	}
	public double getPointsPerGame() {
		return pointsPerGame;
	}
	public void setPointsPerGame(double pointsPerGame) {
		this.pointsPerGame = pointsPerGame;
	}
	public int getRecoveries() {
		return recoveries;
	}
	public void setRecoveries(int recoveries) {
		this.recoveries = recoveries;
	}
	public boolean isUnder21() {
		return under21;
	}
	public void setUnder21(boolean under21) {
		this.under21 = under21;
	}
	public int getTransfersOut() {
		return transfersOut;
	}
	public void setTransfersOut(int transfersOut) {
		this.transfersOut = transfersOut;
	}
	public Integer getChanceOfPlayingThisRound() {
		return chanceOfPlayingThisRound;
	}
	public void setChanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
		this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public double getEpThis() {
		return epThis;
	}
	public void setEpThis(double epThis) {
		this.epThis = epThis;
	}
	public int getTransfersOutEvent() {
		return transfersOutEvent;
	}
	public void setTransfersOutEvent(int transfersOutEvent) {
		this.transfersOutEvent = transfersOutEvent;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getErrorsLeadingToGoal() {
		return errorsLeadingToGoal;
	}
	public void setErrorsLeadingToGoal(int errorsLeadingToGoal) {
		this.errorsLeadingToGoal = errorsLeadingToGoal;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
	public int getBigChancesCreated() {
		return bigChancesCreated;
	}
	public void setBigChancesCreated(int bigChancesCreated) {
		this.bigChancesCreated = bigChancesCreated;
	}
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
	public int getKeyPasses() {
		return keyPasses;
	}
	public void setKeyPasses(int keyPasses) {
		this.keyPasses = keyPasses;
	}
	public int getDreamteamCount() {
		return dreamteamCount;
	}
	public void setDreamteamCount(int dreamteamCount) {
		this.dreamteamCount = dreamteamCount;
	}
}
