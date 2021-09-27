package com.nyota.terminal.model.impl;

import com.nyota.terminal.model.BoardTerminalTypeInt;
import com.nyota.terminal.model.DesktopTerminalTypeInt;
import com.nyota.terminal.model.ServerTerminalTypeInt;

public class TerminalType extends TerminalTypeAbstract implements BoardTerminalTypeInt, DesktopTerminalTypeInt, ServerTerminalTypeInt{

    @Override
    public String getOtherNotes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isIntegratedGSMCard() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isSolarPowered() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setIntegratedGSMCard(boolean integratedGSMCard) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setOtherNotes(String otherNotes) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSolarPowered(boolean solarPowered) {
        // TODO Auto-generated method stub
        
    }
    
}
