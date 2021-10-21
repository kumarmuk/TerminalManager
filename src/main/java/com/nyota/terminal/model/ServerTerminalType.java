package com.nyota.terminal.model;

public class ServerTerminalType extends TerminalTypeAbstract {

    private String terminalType = "SERVER";

    private String rackType;

    public String getRackType() {
        return rackType;
    }

    public void setRackType(String rackType) {
        this.rackType = rackType;
    }

    @Override
    public String getTerminalType() {
        return this.terminalType;
    }

    
    
}
