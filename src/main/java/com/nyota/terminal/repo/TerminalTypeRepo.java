package com.nyota.terminal.repo;

import com.nyota.terminal.data.TerminalTypeData;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TerminalTypeRepo extends MongoRepository<TerminalTypeData, String> {


}
