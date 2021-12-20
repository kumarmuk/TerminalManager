package com.nyota.terminal.data;


import java.util.Map;

import org.springframework.data.annotation.Id;

public class TerminalType {

    @Id
    private String id;  
    
    private String classification;

    private Map<String, String> terminalProperties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Map<String, String> getTerminalProperties() {
        return terminalProperties;
    }

    public void setTerminalProperties(Map<String, String> terminalProperties) {
        this.terminalProperties = terminalProperties;
    }

/*
    public TerminalTypeProperties getTerminalProperties() {
        return terminalProperties;
    }

    public void setTerminalProperties(BoardTerminalTypeData terminalProperties) {
        this.terminalProperties = terminalProperties;
    }

    public void setTerminalProperties(DesktopTerminalTypeData terminalProperties) {
        this.terminalProperties = terminalProperties;
    }

    public void setTerminalProperties(ServerTerminalTypeData terminalProperties) {
        this.terminalProperties = terminalProperties;
    }
*/
}
