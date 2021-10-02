package com.nyota.terminal.model;

public class BoardTerminalType extends TerminalTypeAbstract {

    private String terminaltypeId;
    private boolean integratedGSMCard;
    private String otherNotes;
    private boolean solarPowered;
    
    public BoardTerminalType () {}

    public String getTerminaltypeId() {
        return terminaltypeId;
    }

    public void setTerminaltypeId(String terminaltypeId) {
        this.terminaltypeId = terminaltypeId;
    }

    public String getOtherNotes() {
        return this.otherNotes;
    }

    public boolean isIntegratedGSMCard() {
        return this.integratedGSMCard;
    }

    public boolean isSolarPowered() {
        return this.solarPowered;
    }

    public void setIntegratedGSMCard(boolean integratedGSMCard) {
        this.integratedGSMCard = integratedGSMCard;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
        
    }

    public void setSolarPowered(boolean solarPowered) {
        this.solarPowered = solarPowered;
        
    }

}
