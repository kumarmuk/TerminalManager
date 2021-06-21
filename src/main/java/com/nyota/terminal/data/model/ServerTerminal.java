package com.nyota.terminal.data.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class ServerTerminal extends TerminalType {
	
	@Indexed (unique = true)
	private String friendlyName;
	private String formFactor;
	
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public String getFormFactor() {
		return formFactor;
	}
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	

}
