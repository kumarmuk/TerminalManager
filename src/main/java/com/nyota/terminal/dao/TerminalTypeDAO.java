package com.nyota.terminal.dao;

import java.util.List;

import com.nyota.terminal.data.TerminalTypeData;
import com.nyota.terminal.repo.TerminalTypeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class will be used to get and post all the data to the database
 */
@Component
public class TerminalTypeDAO {

    @Autowired
    TerminalTypeRepo terminalTypeRepo;

    public List<String> geDistinctTerminalTypes () {
        return null;
    }


    public TerminalTypeData getTerminalTypeDTOById(String id) {
        return terminalTypeRepo.findById(id).get();
    }

    public List<TerminalTypeData> getAllTerminalTypeDTO() {
        return terminalTypeRepo.findAll();
    }

    /**
     * This method will be used for storing the terminal type
     * @param ttd
     * @return
     */
    public String saveTerminalypeData (TerminalTypeData ttd){
        String id = terminalTypeRepo.save(ttd).getId();
        System.out.println ("Entity with the " + id + " is being savd;");
        return id;
    } 

}
