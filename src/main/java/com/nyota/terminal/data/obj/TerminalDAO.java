package com.nyota.terminal.data.obj;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.nyota.terminal.data.model.TerminalType;

public class TerminalDAO extends TerminalType {

	@Id
	private String terminalName;
	
	private String terminalType;
	
	private Map terminalProperties;
	
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public Map getTerminalProperties() {
		return terminalProperties;
	}
	public void setTerminalProperties(Map terminalProperties) {
		this.terminalProperties = terminalProperties;
	}
	@Override
	public TerminalDAO toTerminalDAO() {
		// TODO Auto-generated method stub
		return this;
	}

}
