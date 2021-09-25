package com.nyota.terminal.dto;

import com.nyota.terminal.model.impl.BoardTerminalType;
import org.springframework.data.annotation.Id;

public class TerminalTypeDTO {

    @Id
    private String id;

    public BoardTerminalType boardTerminalType;

    public BoardTerminalType getBoardTerminalType() {
        return boardTerminalType;
    }

    public void setBoardTerminalType(BoardTerminalType boardTerminalType) {
        this.boardTerminalType = boardTerminalType;
    }
    
}
