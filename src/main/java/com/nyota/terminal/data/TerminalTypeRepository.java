package com.nyota.terminal.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nyota.terminal.model.TerminalType;

public interface TerminalTypeRepository extends MongoRepository<TerminalType, String> {

	@Override
	default List<TerminalType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
