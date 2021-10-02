package com.nyota.terminal.repo;

import java.util.List;

import com.nyota.terminal.model.BoardTerminalType;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardTerminalTypeRepo extends MongoRepository<BoardTerminalType, String> {

	public List<BoardTerminalType> findByTerminaltypeId(String terminaltypeId);

}
