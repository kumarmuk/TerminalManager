package com.nyota.terminal.data.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyota.terminal.data.obj.TerminalDAO;

public class BoardTerminal extends TerminalType {

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

	public TerminalDAO toTerminalDAO() {
		TerminalDAO termDAO = new TerminalDAO();
		termDAO.setTerminalName(this.getName());
		termDAO.setTerminalType("BOARD");
		Map propertiesMap = new HashMap();
		propertiesMap.put("solarPowered", this.isSolarPowered());
		propertiesMap.put("integratedGSMCard", this.isIntegratedGSMCard());
		propertiesMap.put("otherNotes", this.getOtherNotes());
		termDAO.setTerminalProperties(propertiesMap);
		return termDAO;
	}

}
