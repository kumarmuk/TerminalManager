package com.nyota.terminal.data;

import com.nyota.terminal.model.ServerTerminalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TerminalType")
public class ServerTerminalTypeData extends ServerTerminalType implements TerminalTypeProperties {
    
}
