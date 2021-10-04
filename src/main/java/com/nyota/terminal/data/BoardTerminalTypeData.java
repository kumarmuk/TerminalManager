package com.nyota.terminal.data;

import com.nyota.terminal.model.BoardTerminalType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TerminalType")
public class BoardTerminalTypeData extends BoardTerminalType implements TerminalTypeProperties {
    
    @Id
    private String id;

}
