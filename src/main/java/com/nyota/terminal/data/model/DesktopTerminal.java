package com.nyota.terminal.data.model;

import java.util.HashMap;
import java.util.Map;
import org.springframework.data.mongodb.core.index.Indexed;
import com.nyota.terminal.data.obj.TerminalDAO;


public class DesktopTerminal extends TerminalType {

	private String friendlyName;

	private String formFactor;

	public String getFriendlyName() {
		return friendlyName;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public TerminalDAO toTerminalDAO() {
		TerminalDAO terminalDAO = new TerminalDAO();
		terminalDAO.setTerminalName(this.getName());
		terminalDAO.setTerminalType("DESKTOP");
		Map propertiesMap = new HashMap();
		propertiesMap.put("formFactor", this.getFormFactor());
		terminalDAO.setTerminalProperties(propertiesMap);
		return terminalDAO;
	}

}
