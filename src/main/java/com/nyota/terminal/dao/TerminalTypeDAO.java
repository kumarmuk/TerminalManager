package com.nyota.terminal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class will be used to get and post all the data to the database
 */
@Component
public class TerminalTypeDAO {

   /*  @Autowired
    TerminalTypeRepo terminalTypeRepo;

    public void saveTerminalype(TerminalTypeDTO terminalType) {
        terminalTypeRepo.save(terminalType);
    }

    public TerminalTypeDTO getTerminalTypeDTOById(String id) {
        return terminalTypeRepo.findById(id).get();
    }

    public List<TerminalTypeDTO> getTerminalTypeDTOByName(String name) {
        return terminalTypeRepo.findByName(name);
    }

    public List<TerminalTypeDTO> getAllTerminalTypeDTO() {
        return terminalTypeRepo.findAll();
    }
 */
}
