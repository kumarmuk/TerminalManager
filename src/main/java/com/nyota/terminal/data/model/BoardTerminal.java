package com.nyota.terminal.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class BoardTerminal extends TerminalType {

	@Indexed (unique = true)
	private String friendlyName;
	private boolean solarPowered;
	private String otherNotes;
	private boolean integratedGSMCard;
	
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public boolean isSolarPowered() {
		return solarPowered;
	}
	public void setSolarPowered(boolean solarPowered) {
		this.solarPowered = solarPowered;
	}
	public String getOtherNotes() {
		return otherNotes;
	}
	public void setOtherNotes(String otherNotes) {
		this.otherNotes = otherNotes;
	}
	public boolean isIntegratedGSMCard() {
		return integratedGSMCard;
	}
	public void setIntegratedGSMCard(boolean integratedGSMCard) {
		this.integratedGSMCard = integratedGSMCard;
	}
	
}
