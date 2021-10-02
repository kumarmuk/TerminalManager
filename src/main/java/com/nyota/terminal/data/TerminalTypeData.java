package com.nyota.terminal.data;


import org.springframework.data.annotation.Id;

public class TerminalTypeData {
    
    @Id 
    private String id;

    private DataInterface dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataInterface getDt() {
        return dt;
    }

    public void setDt(DataInterface dt) {
        this.dt = dt;
    }

    
    
    
}
