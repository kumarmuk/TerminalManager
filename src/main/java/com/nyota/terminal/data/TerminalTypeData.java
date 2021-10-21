package com.nyota.terminal.data;


import org.springframework.data.annotation.Id;

public class TerminalTypeData {
    
    @Id 
    private String id;

    private TerminalTypeProperties terminalTypeProperties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TerminalTypeProperties getTerminalTypeProperties() {
        return terminalTypeProperties;
    }

    public void setTerminalTypeProperties(TerminalTypeProperties terminalTypeProperties) {
        this.terminalTypeProperties = terminalTypeProperties;
    }



    
    
    
}
