package com.nyota.terminal.model.impl;

import com.nyota.terminal.model.BoardTerminalTypeInt;
import org.springframework.data.annotation.Id;



public class BoardTerminalType extends TerminalTypeAbstract implements BoardTerminalTypeInt {

    @Id
    private String id;
    
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

    @Override
    public String getOtherNotes() {
        return this.otherNotes;
    }

    @Override
    public boolean isIntegratedGSMCard() {
        return this.integratedGSMCard;
    }

    @Override
    public boolean isSolarPowered() {
        return this.solarPowered;
    }

    @Override
    public void setIntegratedGSMCard(boolean integratedGSMCard) {
        this.integratedGSMCard = integratedGSMCard;
    }

    @Override
    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
        
    }

    @Override
    public void setSolarPowered(boolean solarPowered) {
        this.solarPowered = solarPowered;
        
    }

}
