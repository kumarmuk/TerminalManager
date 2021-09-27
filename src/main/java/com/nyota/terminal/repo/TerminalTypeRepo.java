package com.nyota.terminal.repo;

import java.util.List;

import com.nyota.terminal.dto.TerminalTypeDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TerminalTypeRepo extends MongoRepository<TerminalTypeDTO, String> {

    @Query("{ 'name' : ?0 }")
    public List<TerminalTypeDTO> findByName(String name);
}
