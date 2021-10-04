package com.nyota.terminal.data;


import org.springframework.data.annotation.Id;

public class TerminalTypeData {
    
    @Id 
    private String id;

    private TerminalTypeProperties dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TerminalTypeProperties getDt() {
        return dt;
    }

    public void setDt(TerminalTypeProperties dt) {
        this.dt = dt;
    }

    
    
    
}
