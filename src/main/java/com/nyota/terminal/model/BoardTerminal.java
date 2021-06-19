package com.nyota.terminal.model;

import org.springframework.data.annotation.Id;

public class BoardTerminal extends TerminalType {

	@Id
	public String id;
	private boolean solarPowered;
	private String ssdCardSize;
	private String ramSize;
	private String otherNotes;

	public BoardTerminal() {
	}

	public boolean isSolarPowered() {
		return solarPowered;
	}

	public void setSolarPowered(boolean solarPowered) {
		this.solarPowered = solarPowered;
	}

	public String getSsdCardSize() {
		return ssdCardSize;
	}

	public void setSsdCardSize(String ssdCardSize) {
		this.ssdCardSize = ssdCardSize;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getOtherNotes() {
		return otherNotes;
	}

	public void setOtherNotes(String otherNotes) {
		this.otherNotes = otherNotes;
	}

}
