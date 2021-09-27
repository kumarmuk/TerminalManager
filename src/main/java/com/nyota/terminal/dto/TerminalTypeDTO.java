package com.nyota.terminal.dto;

import com.nyota.terminal.model.impl.BoardTerminalType;

import org.springframework.data.annotation.Id;

public class TerminalTypeDTO {
    
    @Id
    private String id;

    private BoardTerminalType boardTerminalType;

    private TerminalTypeDTO () {};

    public TerminalTypeDTO (BoardTerminalType bt) {
        this.boardTerminalType = bt; 
    }
}
