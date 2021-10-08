package com.nyota.terminal.data;

import com.nyota.terminal.model.ServerTerminalType;

import org.springframework.data.annotation.Id;

public class DesktopTerminalTypeData extends ServerTerminalType implements TerminalTypeProperties {

@Id
private String id;

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}
    
}
