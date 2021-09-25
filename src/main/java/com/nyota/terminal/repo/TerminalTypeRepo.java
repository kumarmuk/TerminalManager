package com.nyota.terminal.repo;



import com.nyota.terminal.dto.TerminalTypeDTO;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TerminalTypeRepo extends MongoRepository <TerminalTypeDTO, String> {

}