package com.nyota.terminal.data.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nyota.terminal.data.model.TerminalType;

public interface TerminalTypeRepository extends MongoRepository<TerminalType, String> {

	@Override
	default List<TerminalType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends TerminalType> S save(S entity) {
		// TODO Auto-generated method stub
		if (entity.getName() == null) {
			return null;
		} else {
			return entity;
		}
	}

}
