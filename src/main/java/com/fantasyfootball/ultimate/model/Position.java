package com.fantasyfootball.ultimate.model;

import com.google.gson.annotations.SerializedName;

public class Position {

	@SerializedName("id")
	private int positionId;
	@SerializedName("singular_name")
	private String singularName;
	@SerializedName("singular_name_short")
	private String singularNameShort;
	@SerializedName("plural_name")
	private String pluralName;
	@SerializedName("plural_name_short")
	private String pluralNameShort;
	
	
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getSingularName() {
		return singularName;
	}
	public void setSingularName(String singularName) {
		this.singularName = singularName;
	}
	public String getSingularNameShort() {
		return singularNameShort;
	}
	public void setSingularNameShort(String singularNameShort) {
		this.singularNameShort = singularNameShort;
	}
	public String getPluralName() {
		return pluralName;
	}
	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}
	public String getPluralNameShort() {
		return pluralNameShort;
	}
	public void setPluralNameShort(String pluralNameShort) {
		this.pluralNameShort = pluralNameShort;
	}
}
