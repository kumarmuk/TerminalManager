package com.nyota.terminal.repo;

import java.util.List;
import java.util.Optional;

import com.nyota.terminal.dto.TerminalTypeDTO;
import com.nyota.terminal.model.impl.BoardTerminalType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface BoardTerminalTypeRepo extends MongoRepository<BoardTerminalType, String> {

	public List<BoardTerminalType> findByTerminaltypeId(String terminaltypeId);

}
