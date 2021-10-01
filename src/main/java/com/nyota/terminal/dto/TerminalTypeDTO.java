package com.nyota.terminal.dto;

import com.nyota.terminal.model.impl.BoardTerminalType;
import com.nyota.terminal.model.impl.DesktopTerminalType;

import org.springframework.data.annotation.Id;

public class TerminalTypeDTO {
    
    @Id
    private String id;

    private BoardTerminalType boardTerminalType;

    private DesktopTerminalType desktopTerminalType;

    private TerminalTypeDTO () {};

    public TerminalTypeDTO (BoardTerminalType bt) {
        this.boardTerminalType = bt; 
    }

    public TerminalTypeDTO (DesktopTerminalType dt) {
        this.desktopTerminalType = dt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BoardTerminalType getBoardTerminalType() {
        return boardTerminalType;
    }

    public void setBoardTerminalType(BoardTerminalType boardTerminalType) {
        this.boardTerminalType = boardTerminalType;
    }

    public DesktopTerminalType getDesktopTerminalType() {
        return desktopTerminalType;
    }

    public void setDesktopTerminalType(DesktopTerminalType desktopTerminalType) {
        this.desktopTerminalType = desktopTerminalType;
    }


    

}
