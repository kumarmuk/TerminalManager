package com.nyota.terminal.model;

public interface BoardTerminalTypeInt extends TerminalTypeInt {
	public boolean isSolarPowered(); 
	public void setSolarPowered(boolean solarPowered); 
	public String getOtherNotes(); 
	public void setOtherNotes(String otherNotes); 
	public boolean isIntegratedGSMCard(); 
	public void setIntegratedGSMCard(boolean integratedGSMCard);
}
