package com.nyota.terminal.model;

public class DesktopTerminalType extends TerminalTypeAbstract  {
    
    private String terminalType = "Desktop";

    private int weight;

    @Override
    public String getTerminalType() {
        return this.terminalType;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int wt) {
        this.weight = wt;

    }


}
