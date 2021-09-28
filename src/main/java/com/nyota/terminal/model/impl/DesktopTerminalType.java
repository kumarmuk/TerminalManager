package com.nyota.terminal.model.impl;

import com.nyota.terminal.model.DesktopTerminalTypeInt;

public class DesktopTerminalType extends TerminalTypeAbstract implements DesktopTerminalTypeInt {

    private int weight;

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(int wt) {
        this.weight = wt;

    }

}
