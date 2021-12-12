package com.nyota.terminal.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;

public class TerminalType {

    @Id
    private String id;  
    
    private String classification;

    private String terminalProperties;

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

    public String getTerminalProperties() {
        return terminalProperties;
    }

    public void setTerminalProperties(String terminalProperties) {
        this.terminalProperties = terminalProperties;
    }
}
